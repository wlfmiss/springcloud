package com.wlf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author LifengWang
 * @create 2020-06-22  1:48
 *
 *  1 添加maven坐标插件
 *  2 启动类添加注解
 *  3 修改host文件 config-3344.com
 *
 */
@SpringBootApplication
@EnableConfigServer   //
public class Config_3344_StartSpringCloudApp {

    public static void main(String[] args) {
        SpringApplication.run(Config_3344_StartSpringCloudApp.class,args);
    }
}
