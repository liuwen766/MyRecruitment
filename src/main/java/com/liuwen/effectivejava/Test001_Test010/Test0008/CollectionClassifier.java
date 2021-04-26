package com.liuwen.effectivejava.Test001_Test010.Test0008;

import java.math.BigInteger;
import java.util.*;

/**
 * ----------------------------------------------------------------------
 * 慎用重载
 *
 * @description: 对传入的集合进行分类(重载使期望输出落空 ： 期望输出是List Set Unknown Collection)
 * @author: Create by Liu Wen at  2020/7/28 20:44
 * ----------------------------------------------------------------------
 **/
public class CollectionClassifier {
    public static void main(String[] args) {

        Collection<?>[] collections = {new HashSet<String>(),
                new ArrayList<Integer>(),
                new HashMap<String, String>().values()
        };

        for (Collection<?> c : collections) {
            System.out.println(classify(c));
        }

    }

    /**
     * @param s
     * @return [s]
     * @Desc 重载方法一：传入一个Set<?>集合则返回Set
     */
    public static String classify(Set<?> s) {
        return "Set";
    }

    /**
     * @param l
     * @return [l]
     * @Desc 重载方法二：传入一个List<?>集合则返回List
     */
    public static String classify(List<?> l) {
        return "List";
    }

    /**
     * @param c
     * @return [c]
     * @Desc 重载方法三：传入一个Collection<?>集合则返回Collection
     */
    public static String classify(Collection<?> c) {
        return "Unknown Collection";
    }

//  public static String classify(Collection<?> c){
//    return c instanceof Set ? "Set":
//           c instanceof List ? "List":
//          "Unknown Collection" ;
//  }
}
