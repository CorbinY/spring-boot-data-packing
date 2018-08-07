package com.lilian.repo.mysql;

import com.lilian.base.mysql.BaseJpaRepository;
import com.lilian.entity.mysql.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/3
 */
public interface EmployeeRepo extends BaseJpaRepository<Employee, Long> {
    /**
     * 根据ID查询全部
     *
     * @param id
     * @return
     */
    @Query("select p from Employee p where p.id = ?1")
    List<Employee> findById(@Param("id") long id);

}
