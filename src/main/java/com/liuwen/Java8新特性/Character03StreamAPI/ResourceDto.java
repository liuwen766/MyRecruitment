package com.liuwen.Java8新特性.Character03StreamAPI;

import lombok.Data;

import java.io.Serializable;

/**
 * ----------------------------------------------------------------------
 * <p>Copyright © 2014-2020 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>The programs can not be copied and/or distributed without the express
 * permission of China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>File name: ResourceDto.java
 * <p>Desc: 对接话单，从bcdig_resource表获取所有共享版（基础版）/未退订的订单信息（customerId,userId, version）
 * <p>
 *
 * @author Create by liuwen at  2020/10/23 10:09
 * <p>
 * ----------------------------------------------------------------------
 **/
@Data
public class ResourceDto implements Serializable {

    String customerId;

    String userId;

    Integer version;

}
