package com.lilian.service.mysql.impl;

import com.lilian.entity.mysql.UserRoleRelation;
import com.lilian.repo.mysql.UserRoleRelationRepo;
import com.lilian.service.mysql.IUserRoleRelationService;
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
public class UserRoleRelationServiceImpl implements IUserRoleRelationService {

    @Autowired
    private UserRoleRelationRepo userRoleRelationRepo;


    @Override
    public void batchAdd(List<UserRoleRelation> userRoleRelationList) {
        userRoleRelationRepo.save(userRoleRelationList);
    }
}
