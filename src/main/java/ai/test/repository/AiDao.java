package ai.test.repository;


import ai.test.domain.AiDto;
import ai.test.domain.AiVo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AiDao {

    @Autowired
    private SqlSessionTemplate sqlSession;

    public List<AiVo> selectList() {
        return sqlSession.selectList("AiMapper.selectList");
    }
}
