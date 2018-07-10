package com.lilian.service.mysql.impl;

import com.lilian.entity.mysql.User;
import com.lilian.repository.mysql.UserJpaRepository;
import com.lilian.service.mysql.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/2
 */
@Service
public class UserServiceImpl implements IUserService {

    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @Autowired
    private UserJpaRepository userRepository;

    @Override
    public List<User> queryAllBetweenAddtime(String startTime, String endTime) throws Exception {

        Date startDate = sdf.parse(startTime);
        Date endDate = sdf.parse(endTime);
        return userRepository.findAllByAddTimeBetween(startDate, endDate);
    }

    @Override
    public void batchAdd(List<User> userList) {
        userRepository.save(userList);
    }

    @Override
    public List<Object[]> queryAllCustom() {
        String sql = "select * from user";

        return userRepository.sqlArrayList(sql);
    }

    @Override
    public List<Object[]> countAgeByPasswordBetweenTime(String startTime, String endTime) throws Exception {
        Date startDate = sdf.parse(startTime);
        Date endDate = sdf.parse(endTime);
        return userRepository.countAgeGroupByName(startDate, endDate);
    }

}
