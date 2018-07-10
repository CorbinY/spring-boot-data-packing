package com.lilian.base.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.repository.core.RepositoryInformation;
import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

import javax.persistence.EntityManager;
import java.io.Serializable;

/**
 * jpa-demo
 * 自定义扩展后的factoryBean
 *
 * @Author 孙龙
 * @Date 2018/7/2
 */
public class BaseJpaRepositoryFactoryBean<R extends JpaRepository<T, I>, T, I extends Serializable>
        extends JpaRepositoryFactoryBean<R, T, I> {

    public BaseJpaRepositoryFactoryBean(Class<? extends R> repositoryInterface) {
        super(repositoryInterface);
    }

    @Override
    protected RepositoryFactorySupport createRepositoryFactory(EntityManager entityManager) {
        return new BaseDaoFactory(entityManager);
    }

    private static class BaseDaoFactory<T, I extends Serializable>
            extends JpaRepositoryFactory {
        private final EntityManager entityManager;

        public BaseDaoFactory(EntityManager entityManager) {
            super(entityManager);
            this.entityManager = entityManager;
        }

        @Override
        protected Object getTargetRepository(RepositoryInformation information) {
            return new SimpleBaseJpaRepository<T, I>((Class<T>) information.getDomainType(), entityManager);
        }


        @Override
        protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {
            return SimpleBaseJpaRepository.class;
        }
    }
}
