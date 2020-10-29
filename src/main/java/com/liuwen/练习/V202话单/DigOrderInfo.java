package com.liuwen.练习.V202话单;

import lombok.Data;

/**
 * ----------------------------------------------------------------------
 * <p>Copyright © 2014-2020 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>The programs can not be copied and/or distributed without the express
 * permission of China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>File name: DigOrderInfo.java
 * <p>Desc: Dig产品侧订单信息详情
 * <p>
 *
 * @author Create by liuwen at  2020/10/29 15:16
 * <p>
 * ----------------------------------------------------------------------
 **/
@Data
public class DigOrderInfo {

    private Integer successCount;

    private String instanceId;

    private Long createTime;

    public DigOrderInfo(String instanceId, Long createTime) {
        this.instanceId = instanceId;
        this.createTime = createTime;
    }

}
