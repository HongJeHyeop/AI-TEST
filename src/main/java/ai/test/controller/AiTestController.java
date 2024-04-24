package ai.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AiTestController {


    @RequestMapping("/ai/index.do")
    public void index(ModelMap model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
    }
}
