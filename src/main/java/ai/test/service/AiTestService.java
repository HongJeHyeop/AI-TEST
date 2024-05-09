package ai.test.service;

import ai.test.domain.AiDto;
import ai.test.domain.AiVo;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface AiTestService {

    public List<AiVo> list(AiVo aiVo) throws Exception;

    public AiVo write(int bookId) throws Exception;

    public Map<String, Object> insert(AiVo aiVo) throws Exception;

    public Map<String, Object> update(AiVo aiVo) throws Exception;

    public Map<String, Object> delete(int bookId) throws Exception;
}
