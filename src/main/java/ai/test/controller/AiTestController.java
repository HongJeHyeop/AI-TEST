package ai.test.controller;

import ai.test.service.AiTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AiTestController {

    @Autowired
    AiTestService service;


    @RequestMapping("/")
    public String main() {
        System.out.println("test1111");
        return "WEB-INF/jsp/ai/aiTest";
    }

    @RequestMapping("/ai/index.do")
    public String index(ModelMap model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("test");
        return service.list(model, request);
    }
}
