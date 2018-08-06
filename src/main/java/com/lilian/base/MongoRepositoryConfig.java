package com.lilian.base;

import com.lilian.base.mongo.BaseMongoRepositoryFactoryBean;
import com.lilian.base.mongo.SimpleBaseMongoRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * jpa-demo
 * 自定义jpa配置类
 *
 * @Author 孙龙
 * @Date 2018/7/2
 */
@Configuration
@EnableMongoRepositories(repositoryBaseClass = SimpleBaseMongoRepository.class, basePackages = {"com.lilian.repo.mongo"}, repositoryFactoryBeanClass = BaseMongoRepositoryFactoryBean.class)
public class MongoRepositoryConfig {
}
