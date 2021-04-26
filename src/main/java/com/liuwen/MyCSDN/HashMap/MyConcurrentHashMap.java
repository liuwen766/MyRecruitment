package com.liuwen.MyCSDN.HashMap;

import org.junit.Test;

import java.util.ConcurrentModificationException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-13 15:30
 **/
public class MyConcurrentHashMap {

    @Test
    public void test1() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(5, 6);
    }

}
