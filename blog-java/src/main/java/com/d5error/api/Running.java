package com.d5error.api;

import com.d5error.entity.DateEntity;
import com.d5error.entity.RunningDataEntity;
import com.d5error.mapper.RunningMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


//https://www.cnblogs.com/fishpro/p/spring-boot-study-restcontroller.html
@RestController
@RequestMapping("/Running")
public class Running {
    @GetMapping("/data")
    public List<RunningDataEntity> data() throws IOException {
//        DateEntity date = new DateEntity(2004, 02, 06);
//        return new RunningDataEntity(2004, 2, 6, 1.3f, 10, 3);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        RunningMapper runningMapper = sqlSession.getMapper(RunningMapper.class);
        List<RunningDataEntity> runningData = runningMapper.selectAll();

        return runningData;
    }
}
