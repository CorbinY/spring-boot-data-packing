package com.lilian.base;

import com.lilian.base.mysql.BaseJpaRepositoryFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * jpa-demo
 * 自定义jpa配置类
 *
 * @Author 孙龙
 * @Date 2018/7/2
 */
@Configuration
@EnableJpaRepositories(basePackages = {"com.lilian.repo.mysql"}, repositoryFactoryBeanClass = BaseJpaRepositoryFactoryBean.class)
public class JpaRepositoryConfig {
}
