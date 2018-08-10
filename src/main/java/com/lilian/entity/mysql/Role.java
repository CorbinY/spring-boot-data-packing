package com.lilian.entity.mysql;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

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

    public Role(String name, String code) {
        this.name = name;
        this.code = code;
    }

}
