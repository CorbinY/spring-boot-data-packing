package com.lilian.repository.mysql;

import com.lilian.base.jpa.BaseJpaRepository;
import com.lilian.entity.mysql.User;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/2
 */
public interface UserJpaRepository extends BaseJpaRepository<User, Long> {
    /**
     * 根据时间范围查询全部
     *
     * @param startTime
     * @param endTime
     * @return
     */
    List<User> findAllByAddTimeBetween(Date startTime, Date endTime);

    /**
     * 按照时间范围统计
     *
     * @param startTime
     * @param endTime
     * @return
     */
    @Query("select u.password, count(u.age) from User u where u.addTime >= ?1 and u.addTime <= ?2 group by u.password")
    List<Object[]> countAgeGroupByName(Date startTime, Date endTime);
}
