package com.lilian.service.mysql.impl;

import com.lilian.entity.mysql.Department;
import com.lilian.entity.mysql.Employee;
import com.lilian.service.mysql.IDepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * spring-boot-data-packing
 *
 * @Author 孙龙
 * @Date 2018/8/7
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentServiceImplTest {

    @Autowired
    private IDepartmentService departmentService;

    @Test
    public void batchAdd() {
        List<Department> departmentList = new ArrayList<Department>(){{
            add(new Department("业务部", "101"));
            add(new Department("开发部", "102"));
        }};
        departmentService.batchAdd(departmentList);
    }

    @Test
    public void queryById() {
        Long deptId = 1L;
        Department department = departmentService.queryById(deptId);
        System.out.println(department.toString());
        List<Employee> employeeList = department.getEmployeeList();
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }

    }
}