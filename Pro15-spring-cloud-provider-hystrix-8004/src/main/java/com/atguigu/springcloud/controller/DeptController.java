package com.atguigu.springcloud.controller;

import com.atguigu.cloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @HystrixCommand(fallbackMethod = "Hystrix")
    @RequestMapping(value = "/dept/get/{deptNo}",method = RequestMethod.GET)
    public Dept get(@PathVariable("deptNo") Integer deptNo){
        if (deptNo == 555) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (deptNo == 999) {
            throw new RuntimeException();
        }
        return deptService.findById(deptNo);
    }

    public Dept Hystrix(@PathVariable("deptNo") Integer deptNo){
        System.out.println("Hystrix is working!");
        return new Dept(deptNo,"error","Hystrix error");
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
