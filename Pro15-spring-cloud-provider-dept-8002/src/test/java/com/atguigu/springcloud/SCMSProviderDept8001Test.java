package com.atguigu.springcloud;

import com.atguigu.cloud.entities.Dept;
import com.atguigu.springcloud.mapper.DeptMapper;
import com.atguigu.springcloud.service.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SCMSProviderDept8001Test {


    @Test
    public void contextLoads() {
    }

    @Autowired
    private DeptService deptService;

    @Autowired
    private DeptMapper deptMapper;
    
    @Autowired
    private DataSource dataSource;

    @Test
    public void testConn() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        System.out.println(connection);
    }

    @Test
    public void testMapper(){
        List<Dept> list = deptMapper.findAll();
        for (Dept dept:list) {
            System.out.println(dept);
        }
    }
    @Test
    public void testService(){
        List<Dept> list = deptService.findAll();
        for (Dept dept:list) {
            System.out.println(dept);
        }
    }

    @Test
    public void testService2(){
        System.out.println(deptService.findById(2));
    }



}
