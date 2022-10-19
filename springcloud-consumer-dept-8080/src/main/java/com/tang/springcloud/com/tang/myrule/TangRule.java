package com.tang.springcloud.com.tang.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TangRule {
    @Bean
    public IRule myRule(){
        return new MyRandomRule(); //默认是轮询RandomRule,现在自定义为自己的
    }
}