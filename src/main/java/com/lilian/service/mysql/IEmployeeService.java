package com.lilian.service.mysql;

import com.lilian.entity.mysql.Employee;

import java.util.List;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/3
 */
public interface IEmployeeService {
    /**
     * 批量添加
     *
     * @param employeeList
     */
    void batchAdd(List<Employee> employeeList);

    /**
     * 根据ID查询（@Query方式）
     *
     * @param id
     * @return
     */
    List<Employee> queryById(Long id);

    /**
     * 根据Addr查询（Specification方式）
     *
     * @param addr
     * @return
     */
    List<Employee> queryByAddr(String addr);

    /**
     * 根据 phoneNum 查询（Specification方式）
     *
     * @param phoneNum
     * @return
     */
    List<Employee> queryByPhoneNum(String phoneNum);


}
