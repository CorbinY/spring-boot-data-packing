package com.lilian.base.mongo;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;

import java.io.Serializable;

/**
 * jpa-demo
 * 自定义接口中方法的实现
 *
 * @Author 孙龙
 * @Date 2018/7/9
 */
public class SimpleBaseMongoRepository<T, ID extends Serializable> extends SimpleMongoRepository<T, ID> implements BaseMongoRepository<T, ID> {

    private final MongoOperations mongoOperations;

    public SimpleBaseMongoRepository(MongoEntityInformation<T, ID> metadata, MongoOperations mongoOperations) {
        super(metadata, mongoOperations);
        this.mongoOperations = mongoOperations;

    }

}
