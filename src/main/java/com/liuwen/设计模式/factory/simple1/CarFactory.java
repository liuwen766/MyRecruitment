package com.liuwen.设计模式.factory.simple1;

/**
 * ----------------------------------------------------------------------
 *
 * @description: 工厂模式（不再new了）   静态工厂（违反开闭原则）
 * @author: Create by Liu Wen at  2020/7/25 10:12
 * ----------------------------------------------------------------------
 **/
public class CarFactory {

    /**
     * @param s
     * @return [s]
     * @Desc 方法1
     */
    public static Car getCar(String s) {
        if (s.equals("wuling")) {
            return new Wuling(s);
        } else if (s.equals("tesla")) {
            return new Tesla();
        } else {
            return null;
        }
    }

    public static Car getWuling() {
        return new Wuling("wuling");
    }

    public static Car getTesla() {
        return new Tesla();
    }


}
