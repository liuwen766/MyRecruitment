package com.liuwen.effectivejava.Test001_Test010.Test0005;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * ----------------------------------------------------------------------
 *
 * @description: （第11个建议）：重写equals 方法时同时也要重写hashcode 方法
 * @author: Create by Liu Wen at  2020/7/26 15:46
 * ----------------------------------------------------------------------
 **/
public class Test005 {
    public static void main(String[] args){

        String string = new Scanner(System.in).toString();
        if("string".equals(string) ){
               System.out.println("不要出现魔法值！");
        }



//        if("1".equals(dangerKey)){
//            BigDecimal warningValue = new BigDecimal(JedisUtils.get(WARNING_VALUE_KEY));
//            model.addAttribute("isDanger", true);
//            model.addAttribute("warningValue", warningValue);
//        }

//        //预警值标识
//        String DANGERKEY_TRUE ="1";
//        if(DANGERKEY_TRUE.equals(dangerKey)){
//            BigDecimal warningValue = new BigDecimal(JedisUtils.get(WARNING_VALUE_KEY));
//            model.addAttribute("isDanger", true);
//            model.addAttribute("warningValue", warningValue);
//        }


    }
}
