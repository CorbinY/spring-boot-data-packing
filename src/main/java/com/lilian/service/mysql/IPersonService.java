package com.lilian.service.mysql;

import com.lilian.entity.mysql.Person;

import java.util.List;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/3
 */
public interface IPersonService {
    /**
     * 批量添加
     *
     * @param personList
     */
    void batchAdd(List<Person> personList);

    /**
     * 根据ID查询（@Query方式）
     *
     * @param id
     * @return
     */
    List<Person> queryById(Long id);

    /**
     * 根据Addr查询（Specification方式）
     *
     * @param addr
     * @return
     */
    List<Person> queryByAddr(String addr);

    /**
     * 根据 phoneNum 查询（Specification方式）
     *
     * @param phoneNum
     * @return
     */
    List<Person> queryByPhoneNum(String phoneNum);


}
