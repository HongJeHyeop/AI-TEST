package ai.test.repository;


import ai.test.domain.AiDto;
import ai.test.domain.AiVo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class AiDao {

    @Autowired
    private SqlSessionTemplate sqlSession;

    public List<AiVo> selectList(AiVo aiVo) {
        return sqlSession.selectList("AiMapper.selectList", aiVo);
    }

    public AiVo write(int bookId) {
        return sqlSession.selectOne("AiMapper.write", bookId);
    }

    public int insert(AiVo aiVo) {
        return sqlSession.insert("AiMapper.insert", aiVo);
    }

    public int update(AiVo aiVo) {
        return sqlSession.update("AiMapper.update", aiVo);
    }

    public int delete(int bookId) {
        return sqlSession.update("AiMapper.delete", bookId);
    }
}
