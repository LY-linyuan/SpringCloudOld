package com.tang.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 临渊
 * @Date 2022-10-16 18:19
 */

@Configuration
public class ConfigBean {    // @Configuration -- spring application.xml

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
