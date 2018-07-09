package com.lilian.service.mongo;

import com.lilian.entity.mongo.Student;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/9
 */
public interface IStudentService {
    /**
     * 查询全部(自带)
     *
     * @return
     */
    List<Student> queryAll();

    /**
     * 批量插入（自带）
     */
    void batchSave(List<Student> studentList);

    /**
     * 根据地址查询全部(名称拼接方式)
     *
     * @param address
     * @return
     */
    List<Student> queryAllByAddr(String address);

    /**
     * 根据实体类中的属性进行模糊查询
     *
     * @param name
     * @return
     */
    List<Student> queryByNameLike(String name);

    /**
     * 模糊查询加分页
     *
     * @param page
     * @param rows
     * @param name
     * @return
     */
    Page<Student> queryByNameAndPage(int page, int rows, String name);

    /**
     * 根据最大年龄查询所有学生
     *
     * @param age
     * @return
     */
    List<Student> queryAllByAgeLessThan(int age);

    /**
     * 根据年龄范围查询全部（Example查询方式）
     *
     * @param student
     * @return
     */
    List<Student> queryByVo(Student student);


}
