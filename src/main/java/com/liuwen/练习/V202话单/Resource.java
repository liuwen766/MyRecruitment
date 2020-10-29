package com.liuwen.练习.V202话单;

import lombok.Data;


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

    private final static String INSTANCE_ID_PREFIX = "BCDIG-";

    /**
     * 数据库自增id
     */

    private Long id;

    /**
     * 当前记录的创建时间
     */

    private Long createTime;

    /**
     * 当前记录的更新时间
     */

    private Long modifiedTime;

    /**
     * 订单id
     */

    private String orderId;

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

    /**
     * DIG资源是否暂停
     * 0:正常状态
     * 1:退订
     * 2:暂停
     */

    private Integer resourceState;

    public Resource() {
    }


}
