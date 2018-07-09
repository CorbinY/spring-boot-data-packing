package com.lilian.service.mongo.impl;

import com.lilian.repository.mongo.StudentRepository;
import com.lilian.service.mongo.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


}
