package com.atguigu.springcloud.service;

import com.atguigu.cloud.entities.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DeptService {

    Dept findById(Integer deptNo);

    List<Dept> findAll();

    boolean addDept(Dept dept);
}
