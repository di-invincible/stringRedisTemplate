package com.example.redis.template.demo.service.impl;


import com.example.redis.template.demo.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author aaron
 * @since 2020-12-02
 */
@Service
public class RedisTemplateImpl implements RedisService {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 存储字符串
     *
     * @param key   key
     * @param value value
     */
    @Override
    public void setString(String key, Object value) {
        redisTemplate.opsForValue().set(key,value);
    }

    /**
     * 存储字符串
     *
     * @param key   key
     * @param value value
     * @param time  过期时间
     */
    @Override
    public void setString(String key, Object value, long time) {

    }

    /**
     * 获取字符串数据
     *
     * @param key key
     * @return Object
     */
    @Override
    public Object getString(String key) {
        return null;
    }

    /**
     * 删除字符串数据
     *
     * @param key key
     * @return Boolean
     */
    @Override
    public Boolean deleteString(String key) {
        return null;
    }

    /**
     * 批量删除字符串数据
     *
     * @param keys key集合
     * @return Long
     */
    @Override
    public Long deleteString(List<String> keys) {
        return null;
    }

    /**
     * 设置过期时间
     *
     * @param key  key
     * @param time 过期时间
     * @return Boolean
     */
    @Override
    public Boolean expire(String key, long time) {
        return null;
    }

    /**
     * 获取过期时间
     *
     * @param key key
     * @return Long
     */
    @Override
    public Long getExpire(String key) {
        return null;
    }

    /**
     * 判断是否有该属性
     *
     * @param key key
     * @return Boolean
     */
    @Override
    public Boolean hasKey(String key) {
        return null;
    }

    /**
     * 按delta递增 以增量的方式将long值存储在变量中
     *
     * @param key   key
     * @param delta 变量
     * @return Long
     */
    @Override
    public Long increment(String key, long delta) {
        return null;
    }

    /**
     * 按delta递增 以增量的方式将double值存储在变量中
     *
     * @param key   key
     * @param delta 变量
     * @return Long
     */
    @Override
    public Long increment(String key, double delta) {
        return null;
    }

    /**
     * 获取Hash结构中的属性
     *
     * @param key     key
     * @param hashKey hash数据的key
     * @return Object
     */
    @Override
    public Object hashGet(String key, String hashKey) {
        return null;
    }

    /**
     * 向Hash结构中放入一个属性
     *
     * @param key     key
     * @param hashKey hash数据的key
     * @param value   value
     * @param time    过期时间
     * @return Boolean
     */
    @Override
    public Boolean hashSet(String key, String hashKey, Object value, long time) {
        return null;
    }

    /**
     * 向Hash结构中放入一个属性
     *
     * @param key     key
     * @param hashKey hash数据的key
     * @param value   value
     */
    @Override
    public void hashSet(String key, String hashKey, Object value) {

    }

    /**
     * 直接获取整个Hash结构
     *
     * @param key key
     * @return Map<Object, Object>
     */
    @Override
    public Map<Object, Object> hashGetAll(String key) {
        return null;
    }

    /**
     * 直接设置整个Hash结构
     *
     * @param key  key
     * @param map  map
     * @param time 过期时间
     * @return Boolean
     */
    @Override
    public Boolean hashSetAll(String key, Map<String, Object> map, long time) {
        return null;
    }

    /**
     * 直接设置整个Hash结构
     *
     * @param key key
     * @param map map
     */
    @Override
    public void hashSetAll(String key, Map<String, Object> map) {

    }

    /**
     * 删除Hash结构中的属性
     *
     * @param key     key
     * @param hashKey hashKey
     */
    @Override
    public void hashDelete(String key, Object... hashKey) {

    }

    /**
     * 判断Hash结构中是否有该属性
     *
     * @param key     key
     * @param hashKey hashKey
     * @return Boolean
     */
    @Override
    public Boolean hashHasKey(String key, String hashKey) {
        return null;
    }

    /**
     * Hash结构中属性递增
     *
     * @param key     key
     * @param hashKey hashKey
     * @param delta   delta
     * @return Long
     */
    @Override
    public Long hashIncrement(String key, String hashKey, Long delta) {
        return null;
    }

    /**
     * Hash结构中属性递减
     *
     * @param key     key
     * @param hashKey hashKey
     * @param delta   delta
     * @return Long
     */
    @Override
    public Long hashDecrement(String key, String hashKey, Long delta) {
        return null;
    }

    /**
     * 获取Set结构
     *
     * @param key key
     * @return Set<Object>
     */
    @Override
    public Set<Object> setMembers(String key) {
        return null;
    }

    /**
     * 向Set结构中添加属性
     *
     * @param key    key
     * @param values values
     * @return Long
     */
    @Override
    public Long setAdd(String key, Object... values) {
        return null;
    }

    /**
     * 向Set结构中添加属性
     *
     * @param key    key
     * @param time   过期时间
     * @param values values
     * @return Long
     */
    @Override
    public Long setAdd(String key, long time, Object... values) {
        return null;
    }

    /**
     * 是否为Set中的属性
     *
     * @param key   key
     * @param value value
     * @return Boolean
     */
    @Override
    public Boolean setIsMember(String key, Object value) {
        return null;
    }

    /**
     * 获取Set结构的长度
     *
     * @param key key
     * @return Long
     */
    @Override
    public Long setSize(String key) {
        return null;
    }

    /**
     * 删除Set结构中的属性
     *
     * @param key    key
     * @param values values
     * @return Long
     */
    @Override
    public Long setRemove(String key, Object... values) {
        return null;
    }

    /**
     * 获取List结构中的属性
     *
     * @param key   key
     * @param start 起始
     * @param end   结束
     * @return List<Object>
     */
    @Override
    public List<Object> listRange(String key, long start, long end) {
        return null;
    }

    /**
     * 获取List结构的长度
     *
     * @param key key
     * @return Long
     */
    @Override
    public Long listSize(String key) {
        return null;
    }

    /**
     * 根据索引获取List中的属性
     *
     * @param key   key
     * @param index 索引
     * @return Object
     */
    @Override
    public Object listIndex(String key, long index) {
        return null;
    }

    /**
     * 向List结构中添加属性
     *
     * @param key   key
     * @param value value
     * @return Long
     */
    @Override
    public Long listPush(String key, Object value) {
        return null;
    }

    /**
     * 向List结构中添加属性
     *
     * @param key   key
     * @param value value
     * @param time  过期时间
     * @return Long
     */
    @Override
    public Long listPush(String key, Object value, long time) {
        return null;
    }

    /**
     * 向List结构中批量添加属性
     *
     * @param key    key
     * @param values 属性集合
     * @return Long
     */
    @Override
    public Long listPushAll(String key, Object... values) {
        return null;
    }

    /**
     * 向List结构中批量添加属性
     *
     * @param key    key
     * @param time   过期时间
     * @param values 属性集合
     * @return Long
     */
    @Override
    public Long listPushAll(String key, Long time, Object... values) {
        return null;
    }

    /**
     * 从List结构中移除属性
     *
     * @param key   key
     * @param count 数量
     * @param value 属性
     * @return Long
     */
    @Override
    public Long listRemove(String key, long count, Object value) {
        return null;
    }
}
