package com.lilian.service.mysql;

import com.lilian.entity.mysql.Department;

import java.util.List;

/**
 * spring-boot-data-packing
 *
 * @Author 孙龙
 * @Date 2018/8/7
 */
public interface IDepartmentService {
    /**
     * 批量添加
     *
     * @param departments
     */
    void batchAdd(List<Department> departments);

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    Department queryById(Long id);
}
