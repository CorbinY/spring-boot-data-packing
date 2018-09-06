package com.lilian.base.redis;

import org.springframework.data.redis.connection.RedisZSetCommands;
import org.springframework.data.redis.core.Cursor;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.ScanOptions;
import org.springframework.data.redis.core.ZSetOperations;

import java.util.Collection;
import java.util.Set;

/**
 * spring-boot-data-packing 公共Redis Zset 类型操作接口
 *
 * @Author 孙龙
 * @Date 2018/9/6
 */
public interface RedisZsetRepository {

    Boolean zsetAdd(String key, String value, double score);

}
