package com.lilian.service.mongo.impl;

import com.lilian.entity.mongo.Student;
import com.lilian.repository.mongo.StudentRepository;
import com.lilian.service.mongo.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/9
 */
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public List<Student> findAll() {

        return studentRepository.findAll();
    }

    @Override
    public void batchSave(List<Student> studentList) {
        studentRepository.insert(studentList);
    }
}
