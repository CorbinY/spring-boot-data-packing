package com.lilian.entity.mysql;

import lombok.Data;

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
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private String addr;
    @Column
    private String email;
    @Column
    private Timestamp addTime;
    @Column
    private String phoneNum;

}
