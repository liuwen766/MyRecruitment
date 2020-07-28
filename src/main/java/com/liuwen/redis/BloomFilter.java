package com.liuwen.redis;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
/**
 * ----------------------------------------------------------------------
 *
 * @description:  布隆过滤器主要用于判断一个元素是否在一个集合中，它可以使用一个位数组简洁的表示一个数组。
 * @author: Create by Liu Wen at  2020/7/27 10:27
 * ----------------------------------------------------------------------
 **/
public class BloomFilter {
  private static final int DEFAULT_SIZE = 2 << 24;
  private static final int[] seeds = new int[] { 5, 7, 11, 13, 31, 37, 61 };
  private BitSet bits = new BitSet(DEFAULT_SIZE);
  private SimpleHash[] func = new SimpleHash[seeds.length];

  public BloomFilter() {
    for (int i = 0; i < seeds.length; i++) {
      func[i] = new SimpleHash(DEFAULT_SIZE, seeds[i]);
    }
  }

  public void add(String value) {
    for (SimpleHash f : func) {
      bits.set(f.hash(value), true);
    }
  }

  public boolean contains(String value) {
    if (value == null) {
      return false;
    }
    boolean ret = true;
    for (SimpleHash f : func) {
      ret = ret && bits.get(f.hash(value));
    }
    return ret;
  }

  // 内部类，simpleHash
  public static class SimpleHash {
    private int cap;
    private int seed;

    public SimpleHash(int cap, int seed) {
      this.cap = cap;
      this.seed = seed;
    }

    public int hash(String value) {
      int result = 0;
      int len = value.length();
      for (int i = 0; i < len; i++) {
        result = seed * result + value.charAt(i);
      }
      return (cap - 1) & result;
    }
  }

  public static void main(String[] args) {
    BloomFilter bf = new BloomFilter();
    List<String> strs = new ArrayList<String>();
    strs.add("123456");
    strs.add("hello word");
    strs.add("transDocId");
    strs.add("123456");
    strs.add("transDocId");
    strs.add("hello word");
    strs.add("test");
    strs.add("helloword");
    strs.add("transDobId");
    strs.add("transDodId");
    strs.add("transDocIe");
    strs.add("transDocIc");
    for (int i=0;i<strs.size();i++) {
      String s = strs.get(i);
      boolean bl = bf.contains(s);
      if(bl){
        System.out.println(i+","+s);
      }else{
        bf.add(s);
      }
    }
  }

}
