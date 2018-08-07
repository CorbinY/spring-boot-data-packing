package com.lilian.service.mysql;

import com.lilian.entity.mysql.User;

import java.util.List;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/2
 */
public interface IUserService {
    /**
     * 根据时间范围查询（Jpa提供的方法名拼接方式）
     *
     * @param startTime
     * @param endTime
     * @return
     * @throws Exception
     */
    List<User> queryAllBetweenAddtime(String startTime, String endTime) throws Exception;

    /**
     * 批量插入（Jpa封装方式）
     *
     * @param userList
     */
    void batchAdd(List<User> userList);

    /**
     * 查询全部（自定义原生SQL方式）
     *
     * @return
     */
    List<Object[]> queryAllCustom();

    /**
     * 按照时间范围统计（@Query方式查询）
     *
     * @param startTime
     * @param endTime
     * @return
     * @throws Exception
     */
    List countAgeByPasswordBetweenTime(String startTime, String endTime) throws Exception;

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    User queryById(Long id);
}
