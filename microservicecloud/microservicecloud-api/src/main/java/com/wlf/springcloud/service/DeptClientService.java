package com.wlf.springcloud.service;

import com.wlf.springcloud.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author LifengWang
 * @create 2020-06-21  12:09
 *
 *  服务降级处理操作  直接针对接口进行操作（原则就是AOP的前面编程，解耦操作）
 *  1、修改microservicecloud-api工程，根据已经有的DeptClientService接口
 *  2、一个实现了FallbackFactory接口的类DeptClientServiceFallbackFactory
 *  3、在接口feign 上添加注解falbackFactory=XXXXX.class
 *
 *
 *
 */
//@FeignClient(value = "MICROSERVICECLOUD-DEPT")
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list();

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept);
}
