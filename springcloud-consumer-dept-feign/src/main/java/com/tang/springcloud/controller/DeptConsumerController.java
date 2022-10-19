package com.tang.springcloud.controller;

import com.tang.springcloud.pojo.Dept;
import com.tang.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author 临渊
 * @Date 2022-10-16 18:19
 */

@RestController
public class DeptConsumerController {

    @Autowired
    private DeptClientService deptClientService = null;

    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDE-DEPT";

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return this.deptClientService.addDept(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.deptClientService.queryById(id);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {
        return this.deptClientService.queryAll();
    }
}
