package ai.test.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AiMapper {
    List selectList();

}
