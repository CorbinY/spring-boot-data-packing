package com.lilian.service.mongo;

import com.lilian.entity.mongo.Student;

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
     * @return
     */
    List<Student> findAll();

    /**
     * 批量插入（自带）
     */
    void batchSave(List<Student> studentList);


}
