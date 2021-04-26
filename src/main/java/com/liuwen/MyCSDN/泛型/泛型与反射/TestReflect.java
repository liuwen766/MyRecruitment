package com.liuwen.MyCSDN.泛型.泛型与反射;

import java.lang.reflect.Constructor;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-31 22:50
 **/
public class TestReflect {
    public static void main(String[] args) throws Exception {
//        Class<Person> personClass = Person.class;
//        Constructor<Person> constructor = personClass.getConstructor();
//        Person person = constructor.newInstance();
        Class personClass = Person.class;
        Constructor constructor = personClass.getConstructor();
        Object person = constructor.newInstance();
        Person p = (Person) person;
        System.out.println(p);
    }
}
