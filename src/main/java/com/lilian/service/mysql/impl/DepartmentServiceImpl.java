package com.lilian.service.mysql.impl;

import com.lilian.entity.mysql.Department;
import com.lilian.repo.mysql.DepartmentRepo;
import com.lilian.service.mysql.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * spring-boot-data-packing
 *
 * @Author 孙龙
 * @Date 2018/8/7
 */
@Service
public class DepartmentServiceImpl implements IDepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    @Override
    public void batchAdd(List<Department> departments) {
        departmentRepo.save(departments);
    }

    @Override
    public Department queryById(Long id) {
        return departmentRepo.findOne(id);
    }
}
