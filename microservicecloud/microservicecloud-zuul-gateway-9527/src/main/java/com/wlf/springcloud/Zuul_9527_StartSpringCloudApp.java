package com.wlf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author LifengWang
 * @create 2020-06-22  0:24
 *
 * // 本地需要修改host 文件 myzuul.com
 * 访问路径通过zuul  路由进行转发访问
 * http://myzuul.com:9527/microservicecloud-dept/dept/get/2
 *
 */
@SpringBootApplication
@EnableZuulProxy // 开启zuul 的自动配置
public class Zuul_9527_StartSpringCloudApp {


    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527_StartSpringCloudApp.class,args);
    }
}
