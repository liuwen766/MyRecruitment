package com.liuwen.练习.V202话单;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * ----------------------------------------------------------------------
 * <p>Copyright © 2014-2020 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>The programs can not be copied and/or distributed without the express
 * permission of China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>File name: DigOrder.java
 * <p>Desc: Dig产品侧订单
 * <p>
 *
 * @author Create by liuwen at  2020/10/29 15:26
 * <p>
 * ----------------------------------------------------------------------
 **/
@Data
@AllArgsConstructor
public class DigOrder {

    private String customerId;

    private DigOrderInfo digOrderInfo;
}
