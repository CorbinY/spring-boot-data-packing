package com.lilian.entity.mysql;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * spring-boot-data-packing
 * 用户角色关系中间表
 *
 * @Author 孙龙
 * @Date 2018/8/7
 */
@Data
@Entity
public class UserRoleRelation {
    @Id
    @GeneratedValue
    private Long id;
    /**
     * 用户Id
     */
    private Long userId;
    /**
     * 角色Id
     */
    private Long roleId;

    public UserRoleRelation(Long userId, Long roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }
}
