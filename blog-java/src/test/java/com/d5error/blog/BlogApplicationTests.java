package com.d5error.blog;

import com.d5error.entity.RunningDataEntity;
import com.d5error.mapper.RunningMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootTest
class BlogApplicationTests {

    @Test
    void justTest() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        RunningMapper runningMapper = sqlSession.getMapper(RunningMapper.class);
        List<RunningDataEntity> runningData = runningMapper.selectAll();

        System.out.println(runningData.get(0));
    }

}
