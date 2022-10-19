package com.tang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author 临渊
 * @Date 2022-10-17 10:12
 */

// Ribbon 和 Eureka 整合以后，客户端可以直接调用，不用关心IP地址和端口号
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.tang.springcloud"})
// @ComponentScan("com.tang.springcloud")
public class FeignDeptConsumer_8080 {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer_8080.class, args);
    }
}