package com.liuwen.各公司笔试题.同花顺校招;

import java.math.BigDecimal;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-18 19:14
 **/
public class Test {
    public static void main(String[] args){
        Long[] data = {1L,2L,3L,4L,5L,6L,7L,8L,9L,10L};
        Long[] result = new Long[data.length-5];
        for (int i =  data.length-1; i > 5;i--) {
            BigDecimal sum = BigDecimal.ZERO;
            for (int j = 0; j < 5; j++) {
                sum = sum.add(new BigDecimal(data[i-j]));
            }
            result[i-5] = sum.divide(new BigDecimal(5)).longValue();
        }
        for (Long count:result
             ) {
            System.out.println(count);
        }
    }

}
