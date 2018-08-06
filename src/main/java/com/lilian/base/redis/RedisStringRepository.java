package com.lilian.base.redis;

/**
 * 公共Redis String 类型操作接口
 *
 * @Author 孙龙
 * @Date 2018/8/6
 */
public interface RedisStringRepository {
    /**
     * 如果 key 已经存在并且是一个字符串， APPEND 命令将 value 追加到 key 原来的值的末尾。
     * 如果 key 不存在， APPEND 就简单地将给定 key 设为 value ，就像执行 SET key value 一样。
     *
     * @param key
     * @param value
     * @return 追加 value 之后， key 中字符串的长度
     */
    Integer stringAppendString(String key, String value);

    /**
     * 获取指定键的值
     *
     * @param key
     * @return
     */
    String stringGetStringByKey(String key);

    /**
     * 获取存储在键上的字符串的子字符串
     *
     * @param key
     * @param start
     * @param end
     * @return 截取后的子字符串
     */
    String stringGetSubStringFromString(String key, long start, long end);

    /**
     * 将键的整数值按给定的长整型数值增加
     *
     * @param key
     * @param delta
     * @return 返回增长后的结果值
     */
    Long stringIncrementLongString(String key, Long delta);

    /**
     * 将键的整数值按给定的浮点型数值增加
     *
     * @param key
     * @param delta
     * @return 返回增长后的结果值
     */
    Double stringIncrementDoubleString(String key, Double delta);

    /**
     * 设置指定键的值
     *
     * @param key
     * @param value
     */
    void stringSetString(String key, String value);

    /**
     * 设置键的字符串值并返回其旧值
     *
     * @param key
     * @param value
     * @return
     */
    String stringGetAndSet(String key, String value);

    /**
     * 使用键和到期时间来设置值,时间单位默认为毫秒
     *
     * @param key
     * @param value
     * @param timeout
     * @return
     */
    void stringSetValueAndExpireTime(String key, String value, long timeout);

}
