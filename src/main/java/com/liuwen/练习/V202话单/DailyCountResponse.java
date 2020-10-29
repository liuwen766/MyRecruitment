package com.liuwen.练习.V202话单;
import lombok.Data;

import java.util.List;

/**
 * ----------------------------------------------------------------------
 * <p>Copyright © 2014-2020 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>The programs can not be copied and/or distributed without the express
 * permission of China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>File name: DailyCountDto.java
 * <p>Desc: 获取各个共享版主账号执行成功的次数 相应参数
 * <p>
 *
 * @author Create by liuwen at  2020/10/22 15:23
 * <p>
 * ----------------------------------------------------------------------
 **/
@Data
public class DailyCountResponse {

    /**
     * 计数日期
     */
    private String countDate;
    /**
     * 成功次数条目
     */
    private List<DailyCountResponseItems> dailyCountResponseItems;

}