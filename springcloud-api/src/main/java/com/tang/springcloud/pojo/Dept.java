package com.tang.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author 临渊
 * @Date 2022-10-15 19:19
 */

@Data
@NoArgsConstructor
@Accessors(chain = true)  // 链式写法
public class Dept implements Serializable {   // Dept 实体类, orm 类表关系映射

    private Long deptno;  // 主键

    private String dname;

    // 看一下这个数据存在那个数据库字段   微服务  一个服务对应一个数据库, 同一个信息可能勋在不同数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }

    /*
        链式写法
        Dept dept = new Dept();

        dept.setDeptNo(11).setDname("sssss").setDb_source("001");
     */
}
