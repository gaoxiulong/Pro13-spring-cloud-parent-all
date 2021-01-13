package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //启用Eureka客户端功能
public class SpringCloudMainClass {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudMainClass.class,args);

        System.out.println("consummer成功启动！");
    }
}
