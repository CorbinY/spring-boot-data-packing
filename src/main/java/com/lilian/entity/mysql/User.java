package com.lilian.entity.mysql;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * jpa-demo 双主键
 *
 * @Author 孙龙
 * @Date 2018/7/2
 */
@NoArgsConstructor
@Data
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    /**
     * 用户名
     */
    private String username;

    /**
     * 添加时间
     */
    private Timestamp addTime;

    /**
     * 密码
     */
    private String password;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 指定中间表
     * 和关系的id
     * 还有逆向的id
     */
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "UserRoleRelation", joinColumns = @JoinColumn(name = "userId", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "roleId", referencedColumnName = "id"))
    private List<Role> roleList;

    public User(Long id, String username, Timestamp addTime, String password, Integer age) {
        this.id = id;
        this.username = username;
        this.addTime = addTime;
        this.password = password;
        this.age = age;
    }
}
