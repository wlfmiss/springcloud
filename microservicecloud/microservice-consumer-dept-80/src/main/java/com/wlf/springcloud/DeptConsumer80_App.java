package com.wlf.springcloud;

import com.wlf.myrule.MySelfRule;
import com.wlf.springcloud.cfgbean.ConfigBeans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author LifengWang
 * @create 2020-06-21  4:51
 */
@SpringBootApplication
@EnableEurekaClient  // 需要跟Eureka 整合，所以属于客户端
/**
 *  @RibbonClient 定义自己的默认规则类
   注意：自定义的配置类（MySelfRule）不能放在@ComponentScan所扫描的当前包以及子包下
   否则我们定义的这个配置类就会被所有的ribbon客户端所共享，也就是说我们达不到特殊的定制目标
 *
 */

@RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = MySelfRule.class)
public class DeptConsumer80_App {


    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class,args);
    }
}
