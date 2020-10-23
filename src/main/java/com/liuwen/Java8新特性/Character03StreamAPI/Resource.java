package com.liuwen.Java8新特性.Character03StreamAPI;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

/**
 * ----------------------------------------------------------------------
 * <p>Copyright © 2014-2020 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>The programs can not be copied and/or distributed without the express
 * permission of China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>File name: Resource.java
 * <p>Desc: BC-DIG相关订单表，记录BC-DIG的订购信息
 * <p>
 *
 * @author Create by shenzhigang at 2019/10/2 23:37
 * <p>
 * ----------------------------------------------------------------------
 */
@Data
public class Resource {

    /**
     * 客户id
     */
    private String customerId;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 是否是主账号
     */

    private Boolean isCustomer;

    /**
     * 资源id
     */
    private String instanceId;

    /**
     * 订购DIG的版本
     * 0：未订购（预留，将来可能会用到）
     * 1：基础版
     * 2：增值版
     */
    private Integer version;


    @Builder
    public Resource( String customerId, String userId, String instanceId, Integer version) {

        this.customerId = customerId;
        this.userId = userId;
        this.isCustomer = isCustomer;
        this.instanceId = instanceId;
        this.version = version;
    }

}
