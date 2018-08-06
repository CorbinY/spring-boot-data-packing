package com.lilian.base.redis;

/**
 * 公共Redis Object 类型操作接口
 *
 * @Author 孙龙
 * @Date 2018/8/6
 */
public interface RedisObjectRepository {

    /**
     * 对象保存方法
     *
     * @param key
     * @param value
     */
    void objectSet(String key, Object value);

    /**
     * 对象类型查询
     *
     * @param key
     * @param clazz
     * @param <T>
     * @return
     */
    <T> T objectGet(String key, Class<T> clazz);
}
