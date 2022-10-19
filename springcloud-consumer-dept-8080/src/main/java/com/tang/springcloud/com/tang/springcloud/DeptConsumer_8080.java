package com.tang.springcloud.com.tang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author 临渊
 * @Date 2022-10-17 10:12
 */

// Ribbon 和 Eureka 整合以后，客户端可以直接调用，不用关心IP地址和端口号
@SpringBootApplication
@EnableEurekaClient
// 在微服务启动的时候就能加载自定义的Ribbon类(自定义的规则会覆盖原有默认的规则)
// @RibbonClient(name = "SPRINGCLOUD-PROVIDE-DEPT",configuration = TangRule.class) // 开启负载均衡,并指定自定义的规则
public class DeptConsumer_8080 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_8080.class, args);
    }
}
