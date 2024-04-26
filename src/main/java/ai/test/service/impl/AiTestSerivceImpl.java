package ai.test.service.impl;

import ai.test.mapper.AiMapper;
import ai.test.service.AiTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class AiTestSerivceImpl implements AiTestService {

    @Autowired
    AiMapper aiMapper;

    @Override
    public String list(ModelMap model, HttpServletRequest request) throws Exception {

        List list = aiMapper.selectList();

        model.addAttribute("list", list);
        return "ai/aiTest";
    }


}
