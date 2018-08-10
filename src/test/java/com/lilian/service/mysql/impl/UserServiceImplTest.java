package com.lilian.service.mysql.impl;

import com.lilian.entity.mysql.Role;
import com.lilian.entity.mysql.User;
import com.lilian.service.mysql.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/2
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private IUserService userService;

    @Test
    public void queryAllBetweenAddtime() throws Exception {
        String startTime = "2018-07-02 15:12:00";
        String endTime = "2018-07-02 15:13:30";
        List<User> userList = userService.queryAllBetweenAddtime(startTime, endTime);
        System.out.println(userList.size());
    }

    @Test
    public void batchAdd() {
        List<User> userList = new ArrayList<User>() {{
            add(new User("admin", new Timestamp(System.currentTimeMillis() - 10000L), "admin", 20));
            add(new User("weiqi", new Timestamp(System.currentTimeMillis() - 20000L), "123", 26));
            add(new User("yuyang", new Timestamp(System.currentTimeMillis() - 30000L), "456", 28));
            add(new User("skylon", new Timestamp(System.currentTimeMillis() - 40000L), "789", 23));
            add(new User("hualong", new Timestamp(System.currentTimeMillis() - 50000L), "159", 21));
            add(new User("duanfei", new Timestamp(System.currentTimeMillis()), "147", 18));
        }};
        userService.batchAdd(userList);
    }

    @Test
    public void queryAllCustom() {
        List<Object[]> objectsList = userService.queryAllCustom();

        for (Object[] objects : objectsList) {
            for (Object object : objects) {
                System.out.println(object);
            }
        }
    }

    @Test
    public void countAgeByPasswordBetweenTime() throws Exception {
        String startTime = "2018-07-03 17:38:46";
        String endTime = "2018-07-03 17:38:56";

        List<Object[]> personList = userService.countAgeByPasswordBetweenTime(startTime, endTime);

        for (Object[] person : personList) {
            System.out.println(person.length);
            for (Object o : person) {
                System.out.println(o);
            }

        }
    }

    @Test
    @Transactional
    public void queryById(){
        User user = userService.queryById(1L);
        List<Role> roleList = user.getRoleList();
        for (Role role : roleList) {
            System.out.println(role.toString());
        }
    }
}