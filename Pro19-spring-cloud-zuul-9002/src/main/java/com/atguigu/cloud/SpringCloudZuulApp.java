package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudZuulApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuulApp.class,args);
        System.out.println("SpringCloudZuulApp：启动成功！");
    }

    // 测试启动顺序：Eureka-->Provider-Hystrix-->Zuul
    // 测试地址如下：
    // 直接访问：http://localhost:8004/dept/get/all
    // zuul访问：http://localhost:9002/atguigu-scms-dept/dept/get/all
}
