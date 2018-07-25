package com.lilian.entity.mongo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
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

    private String name;

    private Integer age;

    private String addr;

    private String email;

    private Date addTime;

    private String phoneNum;

}
