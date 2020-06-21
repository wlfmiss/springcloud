package com.wlf.springcloud.controller;

import com.wlf.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author LifengWang
 * @create 2020-06-21  4:31
 */
@RestController
public class DeptController_Consumer {  // 真正的消费者


    //private  static final  String    REST_URL_PERFIX="http://localhost:8001";
    private  static final  String    REST_URL_PERFIX="http://MICROSERVICECLOUD-DEPT";


    /**
     * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。
     *  (url, requestMap,ResponseBean.class)
     *  这三个参数分别代表
     *  REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     */

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/consumer/dept/add")
    public  boolean add(Dept dept){

        return restTemplate.postForObject(REST_URL_PERFIX+"/dept/add",dept,Boolean.class);
    }
    @RequestMapping(value = "/consumer/dept/get/{id}")
    public  Dept get(@PathVariable("id") Long id){

        return restTemplate.getForObject(REST_URL_PERFIX+"/dept/get/"+id,Dept.class);
    }
    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> get(){

        return restTemplate.getForObject(REST_URL_PERFIX+"/dept/list",List.class);
    }
}
