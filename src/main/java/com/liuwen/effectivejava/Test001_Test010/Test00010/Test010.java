package com.liuwen.effectivejava.Test001_Test010.Test00010;

import java.io.Serializable;
import java.util.Comparator;

/**
 * ----------------------------------------------------------------------
 *
 * @description: （第43个建议）：谨慎的实现Serializable接口
 * @author: Create by Liu Wen at  2020/7/26 19:42
 * ----------------------------------------------------------------------
 **/
public class Test010 implements Serializable {

    /**
     * @Desc Lambada表达式
     * @param null
     * @return
     */
    Comparator<Integer> comparator2 = (o1, o2) -> Integer.compare(o1, o2);


    /**
     * @Desc 方法引用
     * @param null
     * @return
     */
    Comparator<Integer> comparator3 = Integer::compareTo;

}
