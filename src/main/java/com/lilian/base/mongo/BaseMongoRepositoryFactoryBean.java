package com.lilian.base.mongo;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.mongodb.repository.support.MongoRepositoryFactory;
import org.springframework.data.mongodb.repository.support.MongoRepositoryFactoryBean;
import org.springframework.data.mongodb.repository.support.QueryDslMongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.core.RepositoryInformation;
import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

import java.io.Serializable;

import static org.springframework.data.querydsl.QueryDslUtils.QUERY_DSL_PRESENT;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/10
 */
public class BaseMongoRepositoryFactoryBean<T extends MongoRepository<S, ID>, S, ID extends Serializable>
        extends MongoRepositoryFactoryBean<T, S, ID> {

    public BaseMongoRepositoryFactoryBean(Class<? extends T> repositoryInterface) {
        super(repositoryInterface);
    }

    @Override
    protected RepositoryFactorySupport getFactoryInstance(MongoOperations operations) {
        return super.getFactoryInstance(operations);
    }

    private static class LCRRepositoryFactory<S, ID extends Serializable> extends MongoRepositoryFactory {

        private final MongoOperations mongoOperations;

        public LCRRepositoryFactory(MongoOperations mongoOperations) {
            super(mongoOperations);
            this.mongoOperations = mongoOperations;
        }

        @Override
        protected Object getTargetRepository(RepositoryInformation information) {
            Class<?> repositoryInterface = information.getRepositoryInterface();
            MongoEntityInformation<?, Serializable> entityInformation = getEntityInformation(information.getDomainType());
            if (isQueryDslRepository(repositoryInterface)) {
                return new QueryDslMongoRepository(entityInformation, mongoOperations);
            } else {
                return new SimpleBaseMongoRepository<S, ID>((MongoEntityInformation<S, ID>) entityInformation, this.mongoOperations);
            }
        }


        private static boolean isQueryDslRepository(Class<?> repositoryInterface) {
            return QUERY_DSL_PRESENT && QueryDslPredicateExecutor.class.isAssignableFrom(repositoryInterface);
        }

        @Override
        protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {
            return isQueryDslRepository(metadata.getRepositoryInterface()) ? QueryDslMongoRepository.class
                    : SimpleBaseMongoRepository.class;
        }
    }
}
