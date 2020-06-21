package com.wlf.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LifengWang
 * @create 2020-06-21  11:09
 */
@Configuration
public class MySelfRule {


    @Bean
     public IRule  myRule(){

//         return new RandomRule(); //  自己配置的更改官方默认轮训的负载均衡

          return  new RandomRule_ZY();
     }

}
