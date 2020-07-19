package com.liuwen.effectivejava;

import org.junit.Test;

/**
 * ----------------------------------------------------------------------
 * @description:
 * @author: Create by Liu Wen at 2020-07-15 13:53
 * ----------------------------------------------------------------------
 **/

public class FiledType {



    @Test
    public void test01(){
        FiledType filedType = new FiledType();
        System.out.println(filedType);
        System.out.println(filedType.getFieldType());
    }


    private static class FiledHolder{
        static final FiledType filed = new FiledType();
    }
    private static FiledType getFiled(){
        return FiledHolder.filed;
    }




    private volatile FiledType field;

    private FiledType getFieldType(){
        //temp这个变量的作用是确保field只在已经被初始化的情况下读取一次。
        FiledType temp = field;
        if(temp == null){
            synchronized (this){
                if(field == null){
                    field= temp = new FiledType();
                }
            }
        }
        return temp;
    }

    

}
