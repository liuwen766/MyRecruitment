package com.liuwen.MyCSDN.泛型;

import org.junit.Test;

/**
 * @description:  泛型接口实现类-泛型类实现方式
 * @author: Liu Wen
 * @create: 2020-03-19 15:27
 **/
public class Test4<T> implements Test4Interface<T> {

    private T data;    //自定义返回类型

    private void setData(T data){
        this.data=data;
    }

    @Override
    public T getData() {
        return data;
    }

}
