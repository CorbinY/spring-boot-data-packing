package com.lilian.entity.mongo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/9
 */
@Data
public class Student {
    @Id
    private String id;

    private String name;

    private Integer age;

    private String addr;

    private String email;

    private Timestamp addTime;

    private String phoneNum;

}
