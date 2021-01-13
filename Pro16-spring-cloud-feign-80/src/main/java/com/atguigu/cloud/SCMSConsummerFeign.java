package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient   //启用Eureka功能
@EnableFeignClients   //启用Feign功能，简化Consumer的代码，实现远程调用。
public class SCMSConsummerFeign {
    public static void main(String[] args) {
        SpringApplication.run(SCMSConsummerFeign.class,args);

        System.out.println("SCMSConsummerFeign 启动成功！");
    }
}
