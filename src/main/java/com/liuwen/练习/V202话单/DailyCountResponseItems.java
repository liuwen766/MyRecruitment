package com.liuwen.练习.V202话单;

import lombok.Data;

/**
 * ----------------------------------------------------------------------
 * <p>Copyright © 2014-2020 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>The programs can not be copied and/or distributed without the express
 * permission of China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>File name: DailyCountItems.java
 * <p>Desc: 获取各个共享版主账号执行成功的次数 请求参数
 * <p>
 *
 * @author Create by liuwen at  2020/10/22 15:25
 * <p>
 * ----------------------------------------------------------------------
 **/
@Data
public class DailyCountResponseItems {

    /**
     * 主账号id
     */
    private String customerId;
    /**
     * 成功个数
     */
    private Integer successCount;

}