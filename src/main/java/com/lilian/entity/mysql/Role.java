package com.lilian.entity.mysql;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * spring-boot-data-packing
 *
 * @Author 孙龙
 * @Date 2018/8/7
 */
@NoArgsConstructor
@Data
@Entity
public class Role implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String code;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<User> userList;

    public Role(String name, String code) {
        this.name = name;
        this.code = code;
    }

}
