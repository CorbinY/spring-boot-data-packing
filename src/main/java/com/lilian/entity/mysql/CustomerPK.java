package com.lilian.entity.mysql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * jpa-demo User表双主键
 *
 * @Author 孙龙
 * @Date 2018/7/3
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class CustomerPK implements Serializable {
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private String name;

}
