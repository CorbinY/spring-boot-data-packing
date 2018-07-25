package com.lilian.entity.mongo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.util.Date;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/9
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {

    @Id
    private String id;
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
    private String addr;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 添加时间
     */
    private Date addTime;
    /**
     * 手机号
     */
    private String phoneNum;

}
