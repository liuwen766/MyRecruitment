package com.liuwen.设计模式.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * ----------------------------------------------------------------------
 * @author Create by liuwen at  2021/1/10 11:38
 * <p>
 * ----------------------------------------------------------------------
 **/
//具体聚合
class ConcreteAggregate implements Aggregate {
    private List<Object> list = new ArrayList<Object>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return (new ConcreteIterator(list));
    }
}
