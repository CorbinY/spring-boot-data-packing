package com.lilian.repo.mysql;

import com.lilian.base.mysql.BaseJpaRepository;
import com.lilian.entity.mysql.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/3
 */
public interface PersonRepository extends BaseJpaRepository<Person, Long> {
    /**
     * 根据ID查询全部
     *
     * @param id
     * @return
     */
    @Query("select p from Person p where p.id = ?1")
    List<Person> findById(@Param("id") long id);

}
