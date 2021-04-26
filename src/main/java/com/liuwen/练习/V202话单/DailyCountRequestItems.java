package com.liuwen.练习.V202话单;

/**
 * ----------------------------------------------------------------------
 * <p>Copyright © 2014-2020 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>The programs can not be copied and/or distributed without the express
 * permission of China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>File name: DailyCountUserInfo.java
 * <p>Desc: 获取各个共享版主账号执行成功的次数 请求参数
 * <p>
 *
 * @author Create by liuwen at  2020/10/22 15:20
 * <p>
 * ----------------------------------------------------------------------
 **/
public class DailyCountRequestItems {

    /**
     * 主账号id
     */
    private String customerId;
    /**
     * 是否是共享版
     */
    private boolean isShareVersion;

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setIsShareVersion(boolean isShareVersion) {
        this.isShareVersion = isShareVersion;
    }

    public boolean getIsShareVersion() {
        return isShareVersion;
    }
}