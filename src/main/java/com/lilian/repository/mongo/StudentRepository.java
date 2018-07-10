package com.lilian.repository.mongo;

import com.lilian.base.mongo.BaseMongoRepository;
import com.lilian.entity.mongo.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/9
 */
public interface StudentRepository extends BaseMongoRepository<Student, String> {
    /**
     * 根据地址查询所有
     *
     * @param addr
     * @return
     */
    List<Student> findAllByAddr(String addr);

    /**
     * 根据实体类中的属性进行模糊查询
     *
     * @param name
     * @return
     */
    List<Student> findByNameLike(String name);

    /**
     * 根据实体类中的属性进行模糊查询带分页
     * 带分页的模糊查询，其实是把模糊查询以及分页进行合并，
     * 同时我们也需要在PersonRepository仓库中定义方法，
     * 定义方法名的规则和模糊查询的规则一致，只是参数不同而已。
     *
     * @param name
     * @param pageable
     * @return
     */
    Page<Student> findByNameLike(String name, Pageable pageable);

    /**
     * 查询年龄小于某值的所有数据
     *
     * @param maxAge
     * @return
     */
    List<Student> findAllByAgeLessThan(int maxAge);

}
