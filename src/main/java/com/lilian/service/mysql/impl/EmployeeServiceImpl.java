package com.lilian.service.mysql.impl;

import com.lilian.entity.mysql.Employee;
import com.lilian.repo.mysql.EmployeeRepo;
import com.lilian.service.mysql.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/3
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public void batchAdd(List<Employee> employeeList) {
        employeeRepo.save(employeeList);
    }

    @Override
    public List<Employee> queryById(Long id) {
        return employeeRepo.findById(id);
    }

    @Override
    public List<Employee> queryByAddr(String addr) {
        return employeeRepo.findAll((root, query, cb) -> cb.equal(root.get("address"), addr));
    }

    @Override
    public List<Employee> queryByPhoneNum(String phoneNum) {
        return employeeRepo.findAll((root, query, cb) -> cb.equal(root.get("phoneNum"), phoneNum));
    }


}
