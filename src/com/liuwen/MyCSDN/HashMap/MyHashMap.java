package com.liuwen.MyCSDN.HashMap;

import java.util.HashMap;

/**
 * @description:              HashMap源码解析
 * @author: Liu Wen
 * @create: 2020-03-13 12:51
 **/
public class MyHashMap {
    HashMap map = new HashMap();
    private static final long serialVersionUID = 362498820763181265L;  //serialVersionUID适用于Java的序列化机制。简单来说，Java的序列化机制是通过判断类的serialVersionUID来验证版本一致性的。在进行反序列化时，JVM会把传来的字节流中的serialVersionUID与本地相应实体类的serialVersionUID进行比较，如果相同就认为是一致的，可以进行反序列化，否则就会出现序列化版本不一致的异常，即是InvalidCastException。
    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;    // 默认table容量大小2^4，即capacity
    static final int MAXIMUM_CAPACITY = 1 << 30;           // 最大长度2^30
    static final float DEFAULT_LOAD_FACTOR = 0.75f;        // 默认负载因子（当存储的元素>0.75*DEFAULT_INITIAL_CAPACITY,表table容量扩展resize）
    static final int TREEIFY_THRESHOLD = 8;                // 树形化门限(一个链表的长度大于该门限时，链表树形化)
    static final int UNTREEIFY_THRESHOLD = 6;              // 树退化门限
    static final int MIN_TREEIFY_CAPACITY = 64;            // 树形化的最小表容量（避免resizing和treeification之间转化的冲突的门限值）。一般为 4 * TREEIFY_THRESHOLD

    // hash化：对key的hashcode进一步进行计算以及二进制位的调整等来保证最终获取的存储位置尽量分布均匀（hash函数采用各种位运算可能是为了使得低位更加散列）
    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
    //对于给定的目标容量，通过该函数得到最小接近该目标容量的2的幂次方。eg：目标容量10，返回2^4=16
    static final int tableSizeFor(int cap) {
        int n = -1 >>> Integer.numberOfLeadingZeros(cap - 1);
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
    transient int size;                      //此值为key-value键值对的的个数。
    transient int modCount;                  //fail-fast机制（在遍历对象内容时，如果该值发生变化，可能会抛出currentModificationException（思考：为什么不是一定会触发？））
    int threshold;                           //capacity * load factor 容量*负载因子，即门限值
    final float loadFactor;                   //hash表的负载因子
    //HashMap类的主体
    public MyHashMap(int initialCapacity, float loadFactor) {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal initial capacity: " +
                    initialCapacity);
        if (initialCapacity > MAXIMUM_CAPACITY)
            initialCapacity = MAXIMUM_CAPACITY;
        if (loadFactor <= 0 || Float.isNaN(loadFactor))
            throw new IllegalArgumentException("Illegal load factor: " +
                    loadFactor);
        this.loadFactor = loadFactor;
        this.threshold = tableSizeFor(initialCapacity);
    }
}
