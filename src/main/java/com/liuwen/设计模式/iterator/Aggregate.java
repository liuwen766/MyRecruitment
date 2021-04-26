package com.liuwen.设计模式.iterator;

/**
 * ----------------------------------------------------------------------
 * @author Create by liuwen at  2021/1/10 11:38
 * <p>
 * ----------------------------------------------------------------------
 **/
public interface Aggregate {
    public void add(Object obj);
    public void remove(Object obj);
    public Iterator getIterator();
}
