package com.atguigu.cloud.config.beans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced  // 启用Ribbon的负载均衡功能
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
