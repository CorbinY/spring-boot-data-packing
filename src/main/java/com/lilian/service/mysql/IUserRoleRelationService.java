package com.lilian.service.mysql;

import com.lilian.entity.mysql.UserRoleRelation;

import java.util.List;

/**
 * spring-boot-data-packing
 *
 * @Author 孙龙
 * @Date 2018/8/7
 */
public interface IUserRoleRelationService {

    /**
     * 批量添加
     *
     * @param userRoleRelationList
     */
    void batchAdd(List<UserRoleRelation> userRoleRelationList);
}
