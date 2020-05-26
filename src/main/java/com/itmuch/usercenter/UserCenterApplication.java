package com.itmuch.usercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 吴永华
 * @MapperScan 扫描Mybatis哪些包里面的接口
 */
@MapperScan("com.itmuch")
@SpringBootApplication
// 早期的nacos需要写这个注解 @EnableDiscoveryClient
public class UserCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterApplication.class, args);
    }
}