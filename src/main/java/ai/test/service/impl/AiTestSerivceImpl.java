package ai.test.service.impl;

import ai.test.domain.AiDto;
import ai.test.domain.AiVo;
import ai.test.repository.AiDao;
import ai.test.service.AiTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AiTestSerivceImpl implements AiTestService {

    @Autowired
    AiDao aiDao;

    @Override
    public List<AiVo> list() throws Exception {
        return aiDao.selectList();
    }


}
