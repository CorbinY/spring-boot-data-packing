package com.lilian.service.mongo.impl;

import com.lilian.entity.mongo.Student;
import com.lilian.entity.mysql.Person;
import com.lilian.service.mongo.IStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private IStudentService studentService;

    @Test
    public void queryAll() {

        List<Student> studentList = studentService.queryAll();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Test
    public void batchSave() {
        List<Student> studentList = new ArrayList<Student>() {{
            add(new Student("dsrfj3frs", "马云", 35, "杭州", "master@alibaba.com", new Date(System.currentTimeMillis() - 10000L), "186666666"));
            add(new Student("gfrgtr54d", "周鸿祎", 25, "北京", "master@360.com", new Date(System.currentTimeMillis() - 20000L), "1822222222"));
            add(new Student("iuti7thty", "马化腾", 40, "深圳", "master@qq.com", new Date(System.currentTimeMillis() - 30000L), "183333333"));
            add(new Student("vchfgdher", "丁磊", 25, "杭州", "master@163.com", new Date(System.currentTimeMillis() - 40000L), "1844444444"));
        }};
        studentService.batchSave(studentList);
    }

    @Test
    public void queryAllByAddr() {
        String address = "杭州";
        List<Student> studentList = studentService.queryAllByAddr(address);
        for (Student student : studentList) {
            System.out.println(student);
        }

    }

    @Test
    public void queryByNameLike() {
        String name = "马";
        List<Student> studentList = studentService.queryByNameLike(name);
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Test
    public void queryByNameAndPage() {
        String name = "马";
        Page<Student> studentPage = studentService.queryByNameAndPage(0, 10, name);
        System.out.println("总条数" + studentPage.getTotalElements());
        System.out.println("总页数" + studentPage.getTotalPages());
        //数据列表
        List<Student> studentList = studentPage.getContent();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Test
    public void queryAllByAgeLessThan() {
        int age = 35;
        List<Student> studentList = studentService.queryAllByAgeLessThan(age);
        for (Student student : studentList) {
            System.out.println(student);
        }

    }

    @Test
    public void queryByVo() {
//        Student student = new Student(null, null, 25, "杭州", null, null, null);
//        List<Student> studentList = studentService.queryByVo(student);
//        for (Student student1 : studentList) {
//            System.out.println(student1);
//        }

        String sql = "select id, add_time, addr, age, email, name, phone_num from person";
        Person person = jdbcTemplate.queryForObject(sql, (arg0, arg1) -> {
            Person person1 = new Person();
            person1.setId(arg0.getLong("id"));
            person1.setAddr(arg0.getString("addr"));
            person1.setEmail(arg0.getString("email"));
            person1.setName(arg0.getString("name"));
            person1.setPhoneNum(arg0.getString("phone_num"));
            person1.setAge(arg0.getInt("age"));
            return person1;
        });
//        for (Person person : personList) {
            System.out.println(person);
//        }
//        List<Student> studentList1 = mongoTemplate.findAll(Student.class);
//        for (Student student1 : studentList1) {
//            System.out.println(student1);
//        }
    }
}