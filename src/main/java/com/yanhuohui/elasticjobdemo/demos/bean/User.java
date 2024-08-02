package com.yanhuohui.elasticjobdemo.demos.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Classname User
 * @Description TODO
 * @Date 2024/8/1 14:19
 * @Created by 陈义
 */
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    private Long id;

    private String name;

    private int age;
}
