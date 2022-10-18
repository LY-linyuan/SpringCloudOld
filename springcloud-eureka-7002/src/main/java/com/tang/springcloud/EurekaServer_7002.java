package com.tang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author 临渊
 * @Date 2022-10-17 17:50
 */

// 启动之后, 访问 http://localhost:7002/
@SpringBootApplication
@EnableEurekaServer   // @EnableEurekaServer  服务端的启动类, 可以注册别人注册进来
public class EurekaServer_7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7002.class, args);
    }
}
