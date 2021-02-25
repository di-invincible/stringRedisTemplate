package com.example.stringredistemplate.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 通过 SpringRedisTemplate 操作redis
 * @author wd
 * @since 2020-11-23
 */
public interface RedisServiceBySpringRedisTemplate {


    /**
     * 存储字符串
     * @param key key
     * @param value  value
     */
    void setString(String key,Object value);

    /**
     * 存储字符串
     * @param key key
     * @param value value
     * @param time 过期时间
     */
    void setString(String key,Object value, long time);

    /**
     * 获取字符串数据
     * @param key key
     * @return Object
     */
    Object getString(String key);

    /**
     * 删除字符串数据
     * @param key key
     * @return Boolean
     */
    Boolean deleteString(String key);

    /**
     * 批量删除字符串数据
     * @param keys key集合
     * @return Long
     */
    Long deleteString(List<String> keys);

    /**
     * 设置过期时间
     * @param key key
     * @param time 过期时间
     * @return Boolean
     */
    Boolean expire(String key, long time);


    /**
     * 获取过期时间
     * @param key key
     * @return Long
     */
    Long getExpire(String key);


    /**
     * 判断是否有该属性
     * @param key key
     * @return Boolean
     */
    Boolean hasKey(String key);


    /**
     *
     * 按delta递增 以增量的方式将long值存储在变量中
     * @param key key
     * @param delta 变量
     * @return Long
     */
    Long increment(String key, long delta);

    /**
     *  按delta递增 以增量的方式将double值存储在变量中
     * @param key key
     * @param delta 变量
     * @return Long
     */
    Long increment(String key, double delta);


    /**
     * 获取Hash结构中的属性
     * @param key key
     * @param hashKey hash数据的key
     * @return Object
     */
    Object hashGet(String key, String hashKey);


    /**
     *  向Hash结构中放入一个属性
     * @param key key
     * @param hashKey hash数据的key
     * @param value value
     * @param time 过期时间
     * @return Boolean
     */
    Boolean hashSet(String key, String hashKey, Object value, long time);

    /**
     *  向Hash结构中放入一个属性
     * @param key key
     * @param hashKey hash数据的key
     * @param value value
     */
    void hashSet(String key, String hashKey, Object value);

    /**
     * 直接获取整个Hash结构
     * @param key key
     * @return Map<Object, Object>
     */
    Map<Object, Object> hashGetAll(String key);


    /**
     * 直接设置整个Hash结构
     * @param key key
     * @param map map
     * @param time 过期时间
     * @return Boolean
     */
    Boolean hashSetAll(String key, Map<String, Object> map, long time);

    /**
     * 直接设置整个Hash结构
     * @param key key
     * @param map map
     */
    void hashSetAll(String key, Map<String, Object> map);

    /**
     * 删除Hash结构中的属性
     * @param key key
     * @param hashKey hashKey
     */
    void hashDelete(String key, Object... hashKey);


    /**
     * 判断Hash结构中是否有该属性
     * @param key key
     * @param hashKey  hashKey
     * @return Boolean
     */
    Boolean hashHasKey(String key, String hashKey);

    /**
     * Hash结构中属性递增
     * @param key key
     * @param hashKey hashKey
     * @param delta delta
     * @return Long
     */
    Long hashIncrement(String key, String hashKey, Long delta);


    /**
     * Hash结构中属性递减
     * @param key key
     * @param hashKey hashKey
     * @param delta delta
     * @return Long
     */
    Long hashDecrement(String key, String hashKey, Long delta);

    /**
     * 获取Set结构
     * @param key key
     * @return Set<Object>
     */
    Set<Object> setMembers(String key);

    /**
     * 向Set结构中添加属性
     * @param key key
     * @param values values
     * @return Long
     */
    Long setAdd(String key, Object... values);

    /**
     * 向Set结构中添加属性
     * @param key key
     * @param time 过期时间
     * @param values values
     * @return Long
     */
    Long setAdd(String key, long time, Object... values);

    /**
     * 是否为Set中的属性
     * @param key key
     * @param value value
     * @return Boolean
     */
    Boolean setIsMember(String key, Object value);

    /**
     * 获取Set结构的长度
     * @param key key
     * @return Long
     */
    Long setSize(String key);

    /**
     * 删除Set结构中的属性
     * @param key key
     * @param values values
     * @return Long
     */
    Long setRemove(String key, Object... values);

    /**
     * 获取List结构中的属性
     * @param key key
     * @param start 起始
     * @param end 结束
     * @return List<Object>
     */
    List<Object> listRange(String key, long start, long end);

    /**
     * 获取List结构的长度
     * @param key key
     * @return Long
     */
    Long listSize(String key);

    /**
     * 根据索引获取List中的属性
     * @param key key
     * @param index 索引
     * @return Object
     */
    Object listIndex(String key, long index);

    /**
     * 向List结构中添加属性
     * @param key key
     * @param value value
     * @return Long
     */
    Long listPush(String key, Object value);

    /**
     * 向List结构中添加属性
     * @param key key
     * @param value value
     * @param time 过期时间
     * @return Long
     */
    Long listPush(String key, Object value, long time);

    /**
     *  向List结构中批量添加属性
     * @param key key
     * @param values 属性集合
     * @return Long
     */
    Long listPushAll(String key, Object... values);

    /**
     * 向List结构中批量添加属性
     * @param key key
     * @param time 过期时间
     * @param values 属性集合
     * @return Long
     */
    Long listPushAll(String key, Long time, Object... values);

    /**
     * 从List结构中移除属性
     * @param key key
     * @param count 数量
     * @param value 属性
     * @return Long
     */
    Long listRemove(String key, long count, Object value);


}