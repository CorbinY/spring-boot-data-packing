package com.lilian.service.mongo.impl;

import com.lilian.entity.mongo.Student;
import com.lilian.repository.mongo.StudentRepository;
import com.lilian.service.mongo.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
    public List<Student> queryAll() {

        return studentRepository.findAll();
    }

    @Override
    public void batchSave(List<Student> studentList) {
        studentRepository.insert(studentList);
    }

    @Override
    public List<Student> queryAllByAddr(String address) {
        return studentRepository.findAllByAddr(address);
    }

    @Override
    public List<Student> queryByNameLike(String name) {
        return studentRepository.findByNameLike(name);
    }

    @Override
    public Page<Student> queryByNameAndPage(int page, int rows, String name) {
        PageRequest pageRequest = new PageRequest(page, rows);
        return studentRepository.findByNameLike(name, pageRequest);
    }

    @Override
    public List<Student> queryAllByAgeLessThan(int age) {
        return studentRepository.findAllByAgeLessThan(age);
    }

    @Override
    public List<Student> queryByVo(Student student) {

        Example<Student> example = Example.of(student);

        return studentRepository.findAll(example);
    }
}
