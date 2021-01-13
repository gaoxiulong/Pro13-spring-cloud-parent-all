package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@EnableEurekaClient  //Eureka客户端注解
public class SCMSProviderDept8001 {

    public static void main(String[] args) {

        SpringApplication.run(SCMSProviderDept8001.class,args);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(applicationContext.getBean("dept"));

        System.out.println("系统已经成功启动！");

    }






}
