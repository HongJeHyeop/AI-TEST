package ai.test.util;

import com.google.gson.Gson;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmbeddingAi {
    public static List getEmbedding(String txt) throws Exception {
        try {
//            String url = "https://api.openai.com/v1/embeddings";
//            URL obj = new URL(url);
//            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//
//            // 요청 메서드 설정
//            con.setRequestMethod("POST");
//
//            // 헤더 설정
//            con.setRequestProperty("Content-Type", "application/json");
//            con.setRequestProperty("Authorization", "Bearer sk-proj-nPp3PdTtVfM7SpucWtBNT3BlbkFJM8chhSSQUy2YiI50qa19");
//
//            // byte 변환
//            byte[] byteTxt = txt.getBytes("UTF-8");
//            System.out.println(byteTxt);
//
//
//            // 요청 바디 설정
//            String postData = "{\"input\": \"" + txt + "\", \"model\": \"text-embedding-3-small\"}";
//            con.setDoOutput(true);
//            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
//            wr.writeBytes(postData);
//            wr.flush();
//            wr.close();
//
//            // 응답 읽기
//            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//            String inputLine;
//            StringBuffer response = new StringBuffer();
//            while ((inputLine = in.readLine()) != null) {
//                response.append(inputLine);
//            }
//
//            Gson gson = new Gson();
//            Map<String, Object> map = gson.fromJson(response.toString(), Map.class);
//            List<Object> list = (List<Object>) map.get("data");
//            Map<String, Object> map2 = (Map<String, Object>) list.get(0);
//            List<Object> embeddingList = (List<Object>) map2.get("embedding");
//
//            System.out.println("embedding : " + embeddingList.toString());
//            in.close();
//
//            // 응답 출력
//            System.out.println(response.toString());
//
//            return embeddingList;



//            String input = "오늘 만든 치아바타 치킨 샌드위치";
            String model = "text-embedding-3-small";

            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setBearerAuth("sk-proj-nPp3PdTtVfM7SpucWtBNT3BlbkFJM8chhSSQUy2YiI50qa19");

            String url = "https://api.openai.com/v1/embeddings";

            HttpEntity<String> requestEntity = new HttpEntity<>("{\"input\":\"" + txt + "\",\"model\":\"" + model + "\"}", headers);

            ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);

            String embedding = responseEntity.getBody(); // assuming response is a string

            Gson gson = new Gson();
            Map<String, Object> map = gson.fromJson(embedding, Map.class);
            List<Object> list = (List<Object>) map.get("data");
            Map<String, Object> map2 = (Map<String, Object>) list.get(0);
            List<Float> embeddingList = (List<Float>) map2.get("embedding");

            System.out.println(embeddingList);
            return embeddingList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
