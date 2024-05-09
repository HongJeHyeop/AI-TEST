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
    public List<AiVo> list(AiVo aiVo) throws Exception {
        return aiDao.selectList(aiVo);
    }

    @Override
    public AiVo write(int bookId) throws Exception {
        return aiDao.write(bookId);
    }

    @Override
    public Map<String, Object> insert(AiVo aiVo) throws Exception {
        Map<String, Object> result = new HashMap<>();
        int cnt = aiDao.insert(aiVo);

        if (cnt > 0) {
            result.put("result", "success");
            result.put("message", "정상적으로 저장되었습니다.");
        }
        return result;
    }

    @Override
    public Map<String, Object> update(AiVo aiVo) throws Exception {
        Map<String, Object> result = new HashMap<>();
        int cnt = aiDao.update(aiVo);

        if (cnt > 0) {
            result.put("result", "success");
            result.put("message", "정상적으로 수정되었습니다.");
        }
        return result;
    }

    @Override
    public Map<String, Object> delete(int bookId) throws Exception {
        Map<String, Object> result = new HashMap<>();
        int cnt = aiDao.delete(bookId);

        if (cnt > 0) {
            result.put("result", "success");
            result.put("message", "정상적으로 삭제되었습니다.");
        }
        return result;
    }
}
