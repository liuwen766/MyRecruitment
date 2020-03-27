package com.liuwen.牛客网;

/**
 * @description:    把字符串转换成整数
 * @author: Liu Wen
 * @create: 2020-03-23 21:14
 **/
public class Main49 {
    public static void main(String[] args){
        String str = "+";
        int result = StrToInt1(str);
        System.out.println(result);
    }

    /**
     * @Description:        方法2：res=res*10+str[i]-'0';   str[i] & 0xf
     * @date 20.3.24 11:31
     */
    public static int StrToInt1(String str) {
        return 0;
    }

    /**
     * @Description:        方法1：抓取异常的方式（不赞成）
     * @date 20.3.24 11:30
     */
    public static int StrToInt(String str) {
        int ans;
        try {
            ans = Integer.valueOf(str);
        } catch (NumberFormatException e) {   //有异常返回0
            return 0;
        }
        return ans;
    }
}
