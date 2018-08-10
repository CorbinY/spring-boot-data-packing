package com.lilian.service.mysql.impl;

import com.lilian.entity.mysql.Role;
import com.lilian.service.mysql.IRoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
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
public class RoleServiceImplTest {

    @Autowired
    private IRoleService roleService;

    @Test
    public void batchAdd() {
        List<Role> roleList = new ArrayList<Role>() {{
            add(new Role("管理员", "101"));
            add(new Role("测试员", "102"));
            add(new Role("销售员", "103"));
            add(new Role("操作员", "104"));
        }};
        roleService.batchAdd(roleList);
    }

    @Test
    @Transactional
    public void queryById() {
        Role role = roleService.queryById(1L);
        System.out.println(role.toString());
    }
}