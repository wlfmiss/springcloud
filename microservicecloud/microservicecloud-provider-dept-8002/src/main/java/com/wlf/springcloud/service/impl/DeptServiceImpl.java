package com.wlf.springcloud.service.impl;

import com.wlf.springcloud.dao.DeptDao;
import com.wlf.springcloud.entity.Dept;
import com.wlf.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LifengWang
 * @create 2020-06-21  3:51
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
     private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
