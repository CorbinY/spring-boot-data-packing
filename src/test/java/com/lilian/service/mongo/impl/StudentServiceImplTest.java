package com.lilian.service.mongo.impl;

import com.lilian.entity.mongo.Student;
import com.lilian.service.mongo.IStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/9
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentServiceImplTest {

    @Autowired
    private IStudentService studentService;

    @Test
    public void findAll() {

        List<Student> studentList = studentService.findAll();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Test
    public void batchSave() {
        List<Student> studentList = new ArrayList<Student>(){{
           add(new Student("dsrfj3frs", "马云", 35, "杭州", "master@alibaba.com", new Date(System.currentTimeMillis() - 10000L), "186666666"));
           add(new Student("gfrgtr54d", "周鸿祎", 35, "北京", "master@360.com", new Date(System.currentTimeMillis() - 20000L), "1822222222"));
           add(new Student("iuti7thty", "马化腾", 35, "深圳", "master@qq.com", new Date(System.currentTimeMillis() - 30000L), "183333333"));
           add(new Student("vchfgdher", "丁磊", 35, "杭州", "master@163.com", new Date(System.currentTimeMillis() - 40000L), "1844444444"));
        }};
        studentService.batchSave(studentList);
    }
}