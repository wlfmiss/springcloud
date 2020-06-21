package com.wlf.springcloud.controller;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wlf.springcloud.entity.Dept;
import com.wlf.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

/**
 * @author LifengWang
 * @create 2020-06-21  3:56
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    //一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
    @RequestMapping(value ="/dept/get/{id}" ,method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")  // 弊端：需要进行解耦操作
    public  Dept  get(@PathVariable("id") Long id){

        Dept dept = deptService.get(id);
        if (null==dept){
            throw new RuntimeException("该ID"+id+"没有对应的信息");
        }else{

            return  dept;

        }
    }

    public Dept   processHystrix_Get(@PathVariable("id") Long id){
        Dept dept=new Dept();
        dept.setDeptno(id);
        dept.setDname("没有对应的信息,null--@HystrixCommand");
        dept.setDb_source("no this database in MySQL");
        deptService.add(dept);
        return  dept;
    }
}
