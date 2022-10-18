package com.tang.springcloud.controller;

import com.tang.springcloud.pojo.Dept;
import com.tang.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 临渊
 * @Date 2022-10-16 15:16
 */

// 提供Restful 服务！
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
    // 获取一些配置的信息, 得到具体的微服务
    @Autowired
    private DiscoveryClient client;

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptService.queryById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }

    @GetMapping("/dept/discovery")
    // 注册进来的微服务~ , 获取一下消息~
    public Object discovery() {
        // 获取微服务列表的清单
        List<String> services = client.getServices();
        System.out.println("discovery=》service: " + services);

        // 得到一个具体的微服务信息 通过具体的微服务Id 也就是applicationName
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDE-DEPT");
        for (ServiceInstance instance: instances) {
            System.out.println(
                    instance.getHost() + "\t" +
                    instance.getPort() + "\t" +
                    instance.getUri() + "\t" +
                    instance.getServiceId()
            );
        }
        return this.client;
    }




}
