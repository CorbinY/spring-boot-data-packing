package com.lilian.entity.mysql;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/2
 */
@NoArgsConstructor
@Data
@Entity
public class User implements Serializable {

    @EmbeddedId
    private UserPK id;

    @Column(nullable = false)
    private Timestamp addTime;

    @Column(nullable = false)
    private String password;

    private Integer age;

    public User(Long id, String username, Timestamp addTime, String password, Integer age) {
        this.id = new UserPK(id, username);
        this.addTime = addTime;
        this.password = password;
        this.age = age;
    }
}
