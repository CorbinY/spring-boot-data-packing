package com.lilian.service.mysql.impl;

import com.lilian.entity.mysql.Person;
import com.lilian.service.mysql.IPersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/4
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServiceImplTest {

    @Autowired
    private IPersonService personService;

    @Test
    public void queryById() {
        long id = 1L;
        List<Person> personList = personService.queryById(id);
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    @Test
    public void queryByAddr() {
        String addr = "石家庄";
        List<Person> personList = personService.queryByAddr(addr);
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    @Test
    public void queryByPhoneNum() {
        String phoneNum = "1888888888";
        List<Person> personList = personService.queryByPhoneNum(phoneNum);
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}