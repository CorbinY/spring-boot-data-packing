package com.lilian.service.mysql.impl;

import com.lilian.entity.mysql.Person;
import com.lilian.repository.mysql.PersonJpaRepository;
import com.lilian.service.mysql.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/3
 */
@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private PersonJpaRepository personRepository;

    @Override
    public void batchAdd(List<Person> personList) {
        personRepository.save(personList);
    }

    @Override
    public List<Person> queryById(Long id) {
        return personRepository.findById(id);
    }

    @Override
    public List<Person> queryByAddr(String addr) {
        return personRepository.findAll((root, query, cb) -> cb.equal(root.get("address"), addr));
    }

    @Override
    public List<Person> queryByPhoneNum(String phoneNum) {
        return personRepository.findAll((root, query, cb) -> cb.equal(root.get("phoneNum"), phoneNum));
    }


}
