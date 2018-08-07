package com.lilian.repo.mysql;

import com.lilian.base.mysql.BaseJpaRepository;
import com.lilian.entity.mysql.Department;

import java.util.List;

/**
 * spring-boot-data-packing
 *
 * @Author 孙龙
 * @Date 2018/8/7
 */
public interface DepartmentRepo extends BaseJpaRepository<Department, Long> {
//    List<Department> findAllBy

}
