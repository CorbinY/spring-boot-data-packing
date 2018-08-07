package com.lilian.service.mysql.impl;

import com.lilian.repo.mysql.CustomerRepo;
import com.lilian.service.mysql.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * spring-boot-data-packing
 *
 * @Author 孙龙
 * @Date 2018/8/7
 */
@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private CustomerRepo customerRepo;
}
