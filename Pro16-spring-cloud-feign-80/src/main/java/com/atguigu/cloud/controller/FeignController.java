package com.atguigu.cloud.controller;

import com.atguigu.cloud.entities.Dept;
import com.atguigu.cloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignController {

    @Autowired
    private DeptClientService feignService;

    @RequestMapping(value = "/consummer/feign/dept/add",method = RequestMethod.POST)
    public boolean add(Dept dept){
        return feignService.add(dept);
    }

    @RequestMapping(value = "/consummer/feign/dept/get/{deptNo}",method = RequestMethod.GET)
    public Dept get(@PathVariable("deptNo") Integer deptNo){
        return feignService.get(deptNo);
    }

    @RequestMapping(value = "/consummer/feign/dept/get/all",method = RequestMethod.GET)
    public List<Dept> getAll(){
        return feignService.getAll();
    }

}
