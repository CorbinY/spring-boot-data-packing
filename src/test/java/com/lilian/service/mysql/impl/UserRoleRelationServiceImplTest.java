package com.lilian.service.mysql.impl;

import com.lilian.entity.mysql.UserRoleRelation;
import com.lilian.service.mysql.IUserRoleRelationService;
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
public class UserRoleRelationServiceImplTest {

    @Autowired
    private IUserRoleRelationService userRoleRelationService;

    @Test
    public void batchAdd() {
        List<UserRoleRelation> userRoleRelationList = new ArrayList<UserRoleRelation>() {{
            add(new UserRoleRelation(1L, 1L));
            add(new UserRoleRelation(1L, 3L));
            add(new UserRoleRelation(1L, 4L));
            add(new UserRoleRelation(2L, 1L));
            add(new UserRoleRelation(2L, 2L));
            add(new UserRoleRelation(2L, 4L));
        }};

        userRoleRelationService.batchAdd(userRoleRelationList);
    }
}