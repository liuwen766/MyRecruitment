package com.liuwen.redis;

import com.alibaba.fastjson.JSONObject;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

/**
 * ----------------------------------------------------------------------
 *
 * @description: TODO
 * @author: Create by Liu Wen at  2020/7/26 10:15
 * ----------------------------------------------------------------------
 **/
public class JredisTest {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.168.101", 6379);
        System.out.println(jedis.ping());

        System.out.println("客户端启动成功！");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("hello", "world");
        jsonObject.put("name", "kuangshen");
        // 开启事务
        Transaction multi = jedis.multi();
        String result = jsonObject.toJSONString();
        System.out.println(result);

        // jedis.watch(result)
        try {
            multi.set("user1", result);
            multi.set("user2", result);
//      int i = 1 / 0 ; // 代码抛出异常事务，执行失败！
            multi.exec(); // 执行事务！
        } catch (Exception e) {
            multi.discard(); // 放弃事务
            e.printStackTrace();
        } finally {
            System.out.println(jedis.get("user1"));
            System.out.println(jedis.get("user2"));
            jedis.close(); // 关闭连接
        }

    }

}
