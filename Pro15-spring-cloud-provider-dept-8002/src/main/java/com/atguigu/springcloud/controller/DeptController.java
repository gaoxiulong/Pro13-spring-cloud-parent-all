package com.atguigu.springcloud.controller;

import com.atguigu.cloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/get/{deptNo}",method = RequestMethod.GET)
    public Dept get(@PathVariable("deptNo") Integer deptNo){
        return deptService.findById(deptNo);
    }

    @RequestMapping(value = "/dept/get/all",method = RequestMethod.GET)
    public List<Dept> getAll(){
        return deptService.findAll();
    }

    @RequestMapping(value = "dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }

}
