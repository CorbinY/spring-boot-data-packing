package com.lilian.entity.mysql;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * spring-boot-data-packing
 *
 * @Author 孙龙
 * @Date 2018/8/7
 */
@NoArgsConstructor
@Data
@Entity
public class Department {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String code;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "departmentId", referencedColumnName = "id")
    private List<Employee> employeeList;

    public Department(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
