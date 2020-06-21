package com.wlf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author LifengWang
 * @create 2020-06-21  5:32
 */

@SpringBootApplication
@EnableEurekaServer  // Eureka 服务端启动类，结合接受其他微服务注册进来
public class EurekaService7002_App {


    public static void main(String[] args) {
        SpringApplication.run(EurekaService7002_App.class,args);
    }
}
