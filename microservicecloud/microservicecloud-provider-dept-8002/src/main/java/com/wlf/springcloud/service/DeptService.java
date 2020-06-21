package com.wlf.springcloud.service;

import com.wlf.springcloud.entity.Dept;

import java.util.List;

/**
 * @author LifengWang
 * @create 2020-06-21  3:50
 */
public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
