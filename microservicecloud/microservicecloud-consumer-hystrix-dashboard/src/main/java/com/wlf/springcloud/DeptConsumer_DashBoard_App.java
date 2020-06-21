package com.wlf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author LifengWang
 * @create 2020-06-21  23:33
 * 监控操作  直接启动 访问 localhost:9001/hystrix
 *
 * 操作：http://localhost:8001/hystrix.stream
 *
 *
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_DashBoard_App.class,args);
    }
}
