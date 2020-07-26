package com.liuwen.effectivejava.Test001_Test010.Test0004;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * ----------------------------------------------------------------------
 *
 * @description: TODO
 * @author: Create by Liu Wen at  2020/7/26 15:56
 * ----------------------------------------------------------------------
 **/
public class Test0006 {

  public static void main(String[] args) {
    MyHashSet<String> set = new MyHashSet<>();
    set.addAll(Arrays.asList( "zhangsan", "lisi","wangwu"));
    System.out.println(set.getCount());
  }

}

 class MyHashSet<E> extends HashSet<E> {
    private int count = 0;

    public MyHashSet() {

    }

    public MyHashSet(int initCap, float loadFactor) {
      super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
      count++;
      return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
      count += c.size();
      return super.addAll(c);
    }

//   @Override
//   public boolean addAll(Collection<? extends E> c) {
//     boolean modified = false;
//     for (E e : c) {
//       if (add(e)) {
//         modified = true;
//       }
//     }
//     return modified;
//   }

    public int getCount() {
      return count;
    }

}
