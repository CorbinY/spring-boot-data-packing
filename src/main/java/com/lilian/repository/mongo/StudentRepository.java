package com.lilian.repository.mongo;

import com.lilian.entity.mongo.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/9
 */
public interface StudentRepository extends MongoRepository<Student, String> {

}
