package com.liuwen.MyCSDN.集合类;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/**
 * @description:        集合总共有两大接口：Collection和Map
 * @author: Liu Wen               这些都是集合类的顶级父接口方法，实现这两大接口，需要重写这些方法
 * @create: 2020-03-13 11:58
 **/
public class Collection_Map {
    /**
     * @Description:   Collection接口的方法
      * @param null
     * @return
     * @date 20.3.13 12:00
     */
    Collection collection = new Collection() {
        @Override
        public int size() {
            return 0;
        }
        @Override
        public boolean isEmpty() {
            return false;
        }
        @Override
        public boolean contains(Object o) {
            return false;
        }
        @Override
        public Iterator iterator() {
            return null;
        }
        @Override
        public Object[] toArray() {
            return new Object[0];
        }
        @Override
        public Object[] toArray(Object[] a) {
            return new Object[0];
        }
        @Override
        public boolean add(Object o) {
            return false;
        }
        @Override
        public boolean remove(Object o) {
            return false;
        }
        @Override
        public boolean containsAll(Collection c) {
            return false;
        }
        @Override
        public boolean addAll(Collection c) {
            return false;
        }
        @Override
        public boolean removeAll(Collection c) {
            return false;
        }
        @Override
        public boolean retainAll(Collection c) {
            return false;
        }
        @Override
        public void clear() {
        }
    };
    /**
     * @Description:      Map接口的方法
      * @param null
     * @return
     * @date 20.3.13 12:02
     */
    Map map = new Map() {
        @Override
        public int size() {
            return 0;
        }
        @Override
        public boolean isEmpty() {
            return false;
        }
        @Override
        public boolean containsKey(Object key) {
            return false;
        }
        @Override
        public boolean containsValue(Object value) {
            return false;
        }
        @Override
        public Object get(Object key) {
            return null;
        }
        @Override
        public Object put(Object key, Object value) {
            return null;
        }
        @Override
        public Object remove(Object key) {
            return null;
        }
        @Override
        public void putAll(Map m) {

        }
        @Override
        public void clear() {
        }
        @Override
        public Set keySet() {
            return null;
        }
        @Override
        public Collection values() {
            return null;
        }
        @Override
        public Set<Entry> entrySet() {
            return null;
        }
    };

}
