package com.lilian.entity.mysql;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * spring-boot-data-packing 双主键示例
 *
 * @Author 孙龙
 * @Date 2018/8/7
 */
@Data
@Entity
public class Customer {
    @EmbeddedId
    private CustomerPK id;

    private String phoneNum;

    public Customer(Long id, String name, String phoneNum) {
        this.id = new CustomerPK(id, name);
        this.phoneNum = phoneNum;
    }

}
