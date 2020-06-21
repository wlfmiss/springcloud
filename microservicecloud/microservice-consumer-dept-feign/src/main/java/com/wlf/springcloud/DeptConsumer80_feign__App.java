package com.wlf.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author LifengWang
 * @create 2020-06-21  4:51
 */
@SpringBootApplication
@EnableEurekaClient  // 需要跟Eureka 整合，所以属于客户端
@EnableFeignClients(basePackages = {"com.wlf.springcloud"})
@ComponentScan("com.wlf.springcloud")
public class DeptConsumer80_feign__App {


    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_feign__App.class,args);
    }
}
