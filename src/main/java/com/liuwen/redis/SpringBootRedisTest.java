//package com.liuwen.redis;
//
//import com.liuwen.redis.pojo.User;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//
///**
// * ----------------------------------------------------------------------
// *
// * @description: 所有的redis操作，其实对于java开发人员来说，十分的简单，更重要是要去理解redis的思想和每一种数
// * 据结构的用处和作用场景！
// * @author: Create by Liu Wen at  2020/7/26 11:51
// * ----------------------------------------------------------------------
// **/
//
//public class SpringBootRedisTest {
//
//  @Autowired
//  private RedisTemplate redisTemplate;
//
//  /**
//   * @Desc 对象需要序列化
//   * @param
//   * @return []
//   */
//  @Test
//  public void test(){
//    User user = new User("liuwen",26);
//    redisTemplate.opsForValue().set("user",user);
//    Object student1 = redisTemplate.opsForValue().get("user");
//    System.out.println(student1);
//  }
//
//
//
//}
