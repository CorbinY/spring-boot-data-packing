package com.lilian.service.mysql;

import com.lilian.entity.mysql.Role;

import java.util.List;

/**
 * spring-boot-data-packing
 *
 * @Author 孙龙
 * @Date 2018/8/7
 */
public interface IRoleService {
    /**
     * 批量添加
     *
     * @param roleList
     */
    void batchAdd(List<Role> roleList);

    /**
     * 根据Id查询
     *
     * @param id
     * @return
     */
    Role queryById(Long id);
}
