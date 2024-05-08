package ai.test.service.impl;

import ai.test.domain.AiDto;
import ai.test.domain.AiVo;
import ai.test.repository.AiDao;
import ai.test.service.AiTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AiTestSerivceImpl implements AiTestService {

    @Autowired
    AiDao aiDao;

    @Override
    public List<AiVo> list() throws Exception {
        return aiDao.selectList();
    }

    @Override
    public Map<String, Object> insert(ModelMap model, HttpServletRequest request, AiDto aiDto) throws Exception {
        Map<String, Object> result = new HashMap<>();
        int cnt = aiDao.insert(aiDto);

        if (cnt > 0) {
            result.put("result", "success");
            result.put("message", "정상적으로 저장되었습니다.");
        }
        return result;
    }


}
