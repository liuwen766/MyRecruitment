package com.liuwen.effectivejava;

import org.junit.Test;

import java.util.Date;

/**
 * ----------------------------------------------------------------------
 * @description:
 * @author: Create by Liu Wen at 2020-07-15 17:53
 * ----------------------------------------------------------------------
 **/

public class StaticFactoryConstructor {

    private int id;
    private String name;
    private Date bithday;

    public StaticFactoryConstructor() {
    }

    public static StaticFactoryConstructor param1 = new StaticFactoryConstructor();

    public StaticFactoryConstructor(int id, String name, Date bithday) {
        this.id = id;
        this.name = name;
        this.bithday = bithday;
    }



//    @Test
    public void test(){
        //public static final Boolean TRUE = new Boolean(true);
        Boolean bool = Boolean.TRUE;
        System.out.println(bool);
    }
}
