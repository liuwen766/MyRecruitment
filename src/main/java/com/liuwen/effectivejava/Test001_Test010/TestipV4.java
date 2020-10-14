package com.liuwen.effectivejava.Test001_Test010;

import io.netty.util.internal.StringUtil;
import org.openjdk.jcstress.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ----------------------------------------------------------------------
 * <p>Copyright © 2014-2020 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>The programs can not be copied and/or distributed without the express
 * permission of China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>File name: TestipV4.java
 * <p>Desc: TODO
 * <p>
 *
 * @author Create by liuwen at  2020/9/22 23:47
 * <p>
 * ----------------------------------------------------------------------
 **/
public class TestipV4 {

    private static final String ipV4Regex = "^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$";

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            List<Ports> ports = new ArrayList<>(2);
            ports.add(0,new Ports("fd88:5110:982:a:29"));
            ports.add(1,new Ports("192.168.3.20"));
            String ifIpV4NotIpV6 = "";
            //对于有两个IP的端口，优先获取ipV4
            if(null != ports&& ports.size() > 0) {
                for (Ports port : ports) {
                    String privateIp = port.getPrivateIp();
//                    if (ipV4Regex.matches(privateIp)) {
                    if (privateIp.matches(ipV4Regex)) {
                        ifIpV4NotIpV6 = port.getPrivateIp();
                        break;
                    }
                }
                //若全都是IpV6，则选择第一个IpV6
                if (ifIpV4NotIpV6.length()==0) {
                    if (null != ports.get(0)) {
                        ifIpV4NotIpV6 = ports.get(0).getPrivateIp();
                    }
                }
            }

            System.out.println(ifIpV4NotIpV6);

            System.out.println("---------------------");


            String singleIp = "";String doubleIp = "";
            if(null != ports && ports.size() > 0) {
                if (ports.size() == 1) {
                    singleIp = ports.get(0).getPrivateIp();
                }
                if (ports.size() == 2) {
                    doubleIp = ports.get(0).getPrivateIp() + ";" + ports.get(1).getPrivateIp();
                    if (ports.get(0).getPrivateIp().matches(ipV4Regex)) {
                        singleIp = ports.get(0).getPrivateIp();
                    } else {
                        if (ports.get(1).getPrivateIp().matches(ipV4Regex)) {
                            singleIp = ports.get(1).getPrivateIp();
                        } else {
                            singleIp = ports.get(0).getPrivateIp();
                        }
                    }
                }
            }

            System.out.println(doubleIp);
            System.out.println(singleIp);
            System.out.println("++++++++++++++++++++++");
        }



        Date data = new Date();
        System.out.println(data);




    }
}
