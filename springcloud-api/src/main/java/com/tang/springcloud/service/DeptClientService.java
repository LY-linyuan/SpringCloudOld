package com.tang.springcloud.service;

import com.tang.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @Author 临渊
 * @Date 2022-10-19 17:37
 */

@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDE-DEPT")
public interface DeptClientService {

    @GetMapping("/dept/get{id}")
    Dept queryById(@PathVariable("id") Long id);

    @GetMapping("/dept/list")
    List<Dept> queryAll();

    @GetMapping("/dept/add")
    boolean addDept(Dept dept);

}
