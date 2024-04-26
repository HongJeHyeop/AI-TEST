package ai.test.service;

import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;

public interface AiTestService {

    public String list(ModelMap model, HttpServletRequest request) throws Exception;
}
