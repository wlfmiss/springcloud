package com.wlf.springcloud.service;

import com.wlf.springcloud.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author LifengWang
 * @create 2020-06-21  22:50
 */
@Component  // 一定不要忘记添加 一定不要忘记添加 一定不要忘记添加
public class DeptClientServiceFallbackFactory  implements FallbackFactory<DeptClientService> {


    @Override
    public DeptClientService create(Throwable cause) {
        return new  DeptClientService() {
            public Dept get(long id)
            {
                Dept dept=new Dept();
                dept.setDeptno(id);
                dept.setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
                dept.setDb_source("no this database in MySQL");
                return dept;
            }
            @Override
            public List<Dept> list()
            {
                return null;
            }
            @Override
            public boolean add(Dept dept)
            {
                return false;
            }
        };
    }
}
