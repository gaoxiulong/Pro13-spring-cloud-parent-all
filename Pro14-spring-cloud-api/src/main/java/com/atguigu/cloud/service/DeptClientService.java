package com.atguigu.cloud.service;

import com.atguigu.cloud.entities.Dept;
import com.atguigu.cloud.service.factory.DeptClientServiceFallBackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

//value属性指定要调用的provider的微服务名称
//fallbackFactory属性指定服务降级时使用的备选方案工厂
@FeignClient(value = "Atguigu-SCMS-Dept",fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientService {

    @RequestMapping(value="/dept/add", method= RequestMethod.POST)
    public boolean add(@RequestBody Dept dept);

    @RequestMapping(value="/dept/get/{deptNo}", method=RequestMethod.GET)
    public Dept get(@PathVariable("deptNo") Integer deptNo);

    @RequestMapping(value="/dept/get/all", method=RequestMethod.GET)
    public List<Dept> getAll();
}
