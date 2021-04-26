package com.liuwen.redis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * ----------------------------------------------------------------------
 *
 * @description: 对象需要序列化
 * @author: Create by Liu Wen at  2020/7/26 11:49
 * ----------------------------------------------------------------------
 **/

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private String name;
    private Integer age;
}
