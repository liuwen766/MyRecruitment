package com.liuwen.LRULFU;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @desc: 参考LinkedHashMap写出LRU
 * @data: 2021.11.28 10:26
 */
public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private int capacity;

    public LRUCache(int capacity){
        super(capacity,0.75F,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return super.removeEldestEntry(eldest);
    }
}
