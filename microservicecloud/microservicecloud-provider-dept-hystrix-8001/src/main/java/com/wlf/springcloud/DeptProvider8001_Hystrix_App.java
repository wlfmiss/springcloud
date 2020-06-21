package com.wlf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author LifengWang
 * @create 2020-06-21  4:03
 */
@SpringBootApplication
@EnableEurekaClient   // 本服务器启动后自动注册到Eureka中
@EnableCircuitBreaker  // 对hystrix 的支持开启
public class DeptProvider8001_Hystrix_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_Hystrix_App.class,args);
    }
}
