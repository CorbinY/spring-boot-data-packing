package com.lilian.entity.mysql;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/3
 */
@Data
@Entity
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 地址
     */
    private String address;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 添加时间
     */
    private Timestamp addTime;
    /**
     * 手机号码
     */
    private String phoneNum;
    /**
     * 所属部门
     */
    private Long departmentId;

    public Employee(String name, Integer age, String address, String email, Timestamp addTime, String phoneNum, Long departmentId) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.addTime = addTime;
        this.phoneNum = phoneNum;
        this.departmentId = departmentId;
    }
}
