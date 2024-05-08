package ai.test.controller;

import ai.test.domain.AiDto;
import ai.test.domain.AiVo;
import ai.test.service.AiTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;
import java.util.Objects;


@Controller
public class AiTestController {

    @Autowired
    AiTestService service;


    @RequestMapping("/")
    public String main(ModelMap model, HttpServletRequest request, HttpServletResponse response) throws Exception{
        System.out.println("test");
        List<AiVo> list =  service.list();
        model.addAttribute("list", list);
        return "ai/aiList";
    }

    @RequestMapping("/ai/write.do")
    public String index(ModelMap model, HttpServletRequest request, HttpServletResponse response) throws Exception {

        return "ai/aiWrite";
    }

    @RequestMapping("/ai/save.do")
    @ResponseBody
    public Map<String, Object> save(ModelMap model, AiDto aiDto,  HttpServletRequest request) throws Exception {
        System.out.println(aiDto);
        return service.insert(model, request, aiDto);
    }


}
