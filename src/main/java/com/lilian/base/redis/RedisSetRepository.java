package com.lilian.base.redis;

import java.util.Set;

/**
 * 公共Redis Set 类型操作接口
 *
 * @Author 孙龙
 * @Date 2018/8/6
 */
public interface RedisSetRepository {

    /**
     * 将一个或多个 value 元素加入到集合 key 当中，已经存在于集合的 value 元素将被忽略。
     *
     * @param key
     * @param values
     * @return 被添加到集合中的新元素的数量，不包括被忽略的元素。
     */
    Long setAddSetMap(String key, String... values);

    /**
     * 获取set集合的大小
     *
     * @param key
     * @return
     */
    Long setGetSizeForSetMap(String key);

    /**
     * 获取set集合中的元素
     *
     * @param key
     * @return
     */
    Set<String> setGetMemberOfSetMap(String key);

    /**
     * 检查元素是不是set集合中的
     *
     * @param key
     * @param o
     * @return
     */
    Boolean setCheckIsMemberOfSet(String key, Object o);

}
