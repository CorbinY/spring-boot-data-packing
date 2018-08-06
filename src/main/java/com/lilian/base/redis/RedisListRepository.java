package com.lilian.base.redis;

import java.util.List;

/**
 * 公共Redis List类型操作接口
 *
 * @Author 孙龙
 * @Date 2018/8/6
 */
public interface RedisListRepository {
    /**
     * 从右向左存压栈
     *
     * @param key
     */
    void listRightPushList(String key, String value);

    /**
     * 从右出栈
     *
     * @param key
     * @return
     */
    String listRightPopList(String key);

    /**
     * 从左向右存压栈
     *
     * @param key
     * @param value
     */
    void listLeftPushList(String key, String value);

    /**
     * 从左出栈
     *
     * @param key
     * @return
     */
    String listLeftPopList(String key);

    /**
     * 集合list的长度
     *
     * @param key
     * @return
     */
    Long listSize(String key);

    /**
     * 查询列表 key 中指定区间内的元素，区间以偏移量 start 和 stop 指定。
     *
     * @param key
     * @param start
     * @param end
     */
    List<String> listRangeList(String key, Long start, Long end);

    /**
     * 移除key中值为value的i个,返回删除的个数；如果没有这个元素则返回0
     *
     * @param key
     * @param i
     * @param value
     */
    Long listRemoveFromList(String key, long i, Object value);

    /**
     * 根据下标查询list中某个值
     *
     * @param key
     * @param index
     * @return
     */
    String listIndexFromList(String key, long index);

    /**
     * 根据下标设置value
     *
     * @param key
     * @param index
     * @param value
     */
    void listSetValueToList(String key, long index, String value);

    /**
     * 裁剪(删除), 删除 除了[start,end]以外的所有元素
     *
     * @param key
     * @param start
     * @param end
     */
    void listTrimByRange(String key, Long start, Long end);

}
