package com.lilian.base.redis;

/**
 * llld-parent 公共Redis操作类
 * 可添加自定义方法（建议按分类添加到父接口中）
 *
 * @Author 孙龙
 * @Date 2018/8/2
 */
public interface BaseRedisRepository extends RedisHashRepository, RedisSetRepository,
        RedisListRepository, RedisStringRepository,
        RedisObjectRepository, RedisZsetRepository {

    /**
     * 根据键Key删除(hash/set/list/String)
     *
     * @param key
     */
    void deleteFromRedis(String key);

    /**
     * 发布到Topic
     *
     * @param topic
     * @param value
     */
    void publish(String topic, String value);
}
