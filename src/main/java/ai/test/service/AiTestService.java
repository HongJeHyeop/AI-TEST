package ai.test.service;

import ai.test.domain.AiDto;
import ai.test.domain.AiVo;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface AiTestService {

    public List<AiVo> list() throws Exception;
}
