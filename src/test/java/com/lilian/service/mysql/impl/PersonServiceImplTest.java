package com.lilian.service.mysql.impl;

import com.lilian.entity.mysql.Person;
import com.lilian.service.mysql.IPersonService;
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
public class PersonServiceImplTest {

    @Autowired
    private IPersonService personService;

    @Test
    public void batchAdd() {
        List<Person> personList = new ArrayList<Person>() {{
            add(new Person("李四", 25, "北京", "lisi@lll.com", new Timestamp(System.currentTimeMillis() - 10000L), "18844556222"));
            add(new Person("张三", 58, "济南", "zhangsan@lll.com", new Timestamp(System.currentTimeMillis() - 15000L), "16666555222"));
            add(new Person("老王", 14, "合肥", "laowang@lll.com", new Timestamp(System.currentTimeMillis() - 20000L), "11222213222"));
            add(new Person("赵六", 42, "广州", "zhaoliu@lll.com", new Timestamp(System.currentTimeMillis() - 30000L), "15555433322"));
            add(new Person("武大", 63, "上海", "wuda@lll.com", new Timestamp(System.currentTimeMillis() - 40000L), "18766676622"));
            add(new Person("孙五", 45, "石家庄", "sunwu@lll.com", new Timestamp(System.currentTimeMillis()), "1888888888"));

        }};
        personService.batchAdd(personList);
    }

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