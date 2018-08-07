package com.lilian.service.mysql.impl;

import com.lilian.entity.mysql.Employee;
import com.lilian.service.mysql.IEmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/4
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceImplTest {

    @Autowired
    private IEmployeeService employeeService;

    @Test
    public void batchAdd() {
        List<Employee> employeeList = new ArrayList<Employee>() {{
            add(new Employee("Skylon", 27, "山东", "skylon@lll.com", new Timestamp(System.currentTimeMillis() - 80000L), "1884459999", 1L));
            add(new Employee("李四", 25, "北京", "lisi@lll.com", new Timestamp(System.currentTimeMillis() - 10000L), "1884455622", 1L));
            add(new Employee("张三", 58, "济南", "zhangsan@lll.com", new Timestamp(System.currentTimeMillis() - 15000L), "16666555666", 1L));
            add(new Employee("老王", 14, "合肥", "laowang@lll.com", new Timestamp(System.currentTimeMillis() - 20000L), "11222213222", 1L));
            add(new Employee("赵六", 42, "广州", "zhaoliu@lll.com", new Timestamp(System.currentTimeMillis() - 30000L), "15555433322", 1L));
            add(new Employee("武大", 63, "上海", "wuda@lll.com", new Timestamp(System.currentTimeMillis() - 40000L), "18766676622", 2L));
            add(new Employee("孙五", 45, "石家庄", "sunwu@lll.com", new Timestamp(System.currentTimeMillis()), "1888888888", 2L));

        }};
        employeeService.batchAdd(employeeList);
    }

    @Test
    public void queryById() {
        long id = 1L;
        List<Employee> employeeList = employeeService.queryById(id);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Test
    public void queryByAddr() {
        String addr = "石家庄";
        List<Employee> employeeList = employeeService.queryByAddr(addr);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Test
    public void queryByPhoneNum() {
        String phoneNum = "1888888888";
        List<Employee> employeeList = employeeService.queryByPhoneNum(phoneNum);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}