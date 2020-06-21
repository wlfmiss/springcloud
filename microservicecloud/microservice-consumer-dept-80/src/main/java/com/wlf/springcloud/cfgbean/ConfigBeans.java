package com.wlf.springcloud.cfgbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author LifengWang
 * @create 2020-06-21  4:21
 */
@Configuration
public class ConfigBeans {  //  boot   -->spring  applicationContext.xml    @Configuration 配置=applicationContext.xml


    @Bean
    @LoadBalanced    // Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具
    public RestTemplate getRestTemplate(){

        return  new RestTemplate();
    }

    @Bean
    public IRule myRule(){  //随机算法

//        return  new RoundRobinRule();  //这个是随机算法
//          return  new RandomRule();// 随机算法
           return  new RetryRule(); //（默认是轮训 如果出故障。则长时间没有相应，直接取消访问） 如果服务出现故障，长时间访问没有相应，直接跳过不访问该服务
    }
}
