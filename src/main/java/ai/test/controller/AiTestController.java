package ai.test.controller;

import ai.test.domain.AiDto;
import ai.test.domain.AiVo;
import ai.test.service.AiTestService;
import ai.test.util.EmbeddingAi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


@Controller
public class AiTestController {

    @Autowired
    AiTestService service;


    @RequestMapping("/")
    public String main(ModelMap model,@RequestParam(name = "searchTxt",required = false) String searchTxt) throws Exception{
        AiVo aiVo = new AiVo();
        System.out.println("test");
        if (searchTxt != null && !"".equals(searchTxt)) {
            List<Float> embeddingList =  EmbeddingAi.getEmbedding(searchTxt);
            float[] arr = new float[embeddingList.size()];
            for (int i=0; i < embeddingList.size(); i++) {
                arr[i] = Float.parseFloat(String.valueOf(embeddingList.get(i)));
            }
            System.out.println(arr.toString());
            aiVo.setEmbedding(arr);
        }
        List<AiVo> list =  service.list(aiVo);
        model.addAttribute("list", list);
        return "ai/aiList";
    }

    @RequestMapping("/ai/write.do")
    public String index(ModelMap model, HttpServletRequest request) throws Exception {
        String bookId = request.getParameter("id");
        if (bookId != null) {
            int id = Integer.parseInt(bookId);
            System.out.println(id);
            model.addAttribute("resultVO", service.write(id));
        }
        return "ai/aiWrite";
    }

    @RequestMapping("/ai/save.do")
    @ResponseBody
    public Map<String, Object> save(@RequestBody(required = false) AiVo aiVo,@RequestParam("status") String status) throws Exception {
//        Map<String, String[]> parameterMap = request.getParameterMap();
        System.out.println(aiVo.toString());

        if ("C".equals(status)) {
            List<Float> embeddingList =  EmbeddingAi.getEmbedding(aiVo.getBookNm());
            float[] arr = new float[embeddingList.size()];
            for (int i=0; i < embeddingList.size(); i++) {
                arr[i] = Float.parseFloat(String.valueOf(embeddingList.get(i)));
            }
            aiVo.setEmbedding(arr);

            return service.insert(aiVo);
        } else if ("U".equals(status)) {
            return service.update(aiVo);
        } else if ("D".equals(status)) {
            return service.delete(aiVo.getBookId());
        } else {
            Map<String, Object> result = new HashMap<>();
            result.put("result", "fail");
            result.put("message", "잘못된 요청입니다.");
            return result;
        }

    }

    @RequestMapping("/ai/delete.do/{id}")
    @ResponseBody
    public Map<String, Object> delete(@PathVariable int id) throws Exception {
        return service.delete(id);
    }

    @RequestMapping("/ai/test")
    public void embedding() throws Exception {
       List embeddingList =  EmbeddingAi.getEmbedding("바나나");

    }


}
