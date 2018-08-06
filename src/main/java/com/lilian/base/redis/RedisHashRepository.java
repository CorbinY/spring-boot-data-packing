package com.lilian.base.redis;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 公共Redis Hash类型操作接口
 *
 * @Author 孙龙
 * @Date 2018/8/6
 */
public interface RedisHashRepository {

    /**
     * 查看哈希表 hKey 中，给定域 hashKey 是否存在。
     *
     * @param hKey    哈希表名称
     * @param hashKey 域的hashKey
     * @return 如果哈希表含有给定域，返回 1 ;如果哈希表不含有给定域，或 hashKey 不存在，返回 0 。
     */
    Boolean hashCheckHxists(String hKey, String hashKey);

    /**
     * 查询哈希表 hKey 中给定域 hashKey 的值。
     *
     * @param hKey
     * @param hashKey
     * @return 给定域的值。当给定域不存在或是给定 key 不存在时，返回 nil 。
     */
    Object hashGet(String hKey, String hashKey);

    /**
     * 获取所有的散列值
     *
     * @param key
     */
    Map<Object, Object> hashGetAll(String key);

    /**
     * 哈希表 hKey 中的域 hashKey 的值加上增量 delta 。
     * 增量也可以为负数，相当于对给定域进行减法操作。  如果 key 不存在，一个新的哈希表被创建并执行 HINCRBY 命令。
     * 如果域 field 不存在，那么在执行命令前，域的值被初始化为 0 。  对一个储存字符串值的域 field 执行 HINCRBY 命令将造成一个错误。
     *
     * @param hKey
     * @param hashKey
     * @param delta
     * @return 执行 HINCRBY 命令之后，哈希表 hKey 中域 hashKey 的值。
     */
    Long hashIncrementLongOfHashMap(String hKey, String hashKey, Long delta);

    /**
     * 哈希表 hKey 中的域 hashKey 的值加上浮点值 增量 delta 。
     *
     * @param hKey
     * @param hashKey
     * @param delta
     * @return 执行 HINCRBY 命令之后，哈希表 hKey 中域 hashKey 的值。
     */
    Double hashIncrementDoubleOfHashMap(String hKey, String hashKey, Double delta);

    /**
     * 添加键值对到哈希表key中
     *
     * @param key
     * @param hashKey
     */
    void hashPushHashMap(String key, Object hashKey, Object value);

    /**
     * 获取哈希表key中的所有域
     *
     * @param key
     */
    Set<Object> hashGetAllHashKey(String key);

    /**
     * 获取散列中的字段数量
     *
     * @param key
     */
    Long hashGetHashMapSize(String key);

    /**
     * 获取哈希中的所有值
     *
     * @param key
     */
    List<Object> hashGetHashAllValues(String key);

    /**
     * 删除一个或多个哈希字段
     *
     * @param key
     * @param hashKeys
     * @return 返回值为被成功删除的数量
     */
    Long hashDeleteHashKey(String key, Object... hashKeys);

}
