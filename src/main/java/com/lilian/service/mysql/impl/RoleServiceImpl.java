package com.lilian.service.mysql.impl;

import com.lilian.entity.mysql.Role;
import com.lilian.repo.mysql.RoleRepo;
import com.lilian.service.mysql.IRoleService;
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
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private RoleRepo roleRepo;


    @Override
    public void batchAdd(List<Role> roleList) {
        roleRepo.save(roleList);
    }

    @Override
    public Role queryById(Long id) {
        return roleRepo.findOne(id);
    }
}
