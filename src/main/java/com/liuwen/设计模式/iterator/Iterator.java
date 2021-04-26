package com.liuwen.设计模式.iterator;

//抽象迭代器
interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
}