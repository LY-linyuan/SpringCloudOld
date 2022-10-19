package com.tang.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 临渊
 * @Date 2022-10-16 18:19
 */

@Configuration
public class ConfigBean {    // @Configuration -- spring application.xml

    // 配置负载均衡实现RestTemplate
    @Bean
    @LoadBalanced  // Ribbon
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }



}
