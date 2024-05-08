package ai.test.service;

import ai.test.domain.AiDto;
import ai.test.domain.AiVo;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface AiTestService {

    public List<AiVo> list() throws Exception;

    public Map<String, Object> insert(ModelMap model, HttpServletRequest request, AiDto aiDto) throws Exception;
}
