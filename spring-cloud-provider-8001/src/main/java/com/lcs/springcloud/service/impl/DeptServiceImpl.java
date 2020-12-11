package com.lcs.springcloud.service.impl;

import com.lcs.springcloud.dao.DeptDao;
import com.lcs.springcloud.entities.DeptEntity;
import com.lcs.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(DeptEntity deptEntity) {
        return deptDao.addDept(deptEntity);
    }

    @Override
    public DeptEntity get(Long deptNo) {
        return deptDao.findById(deptNo);
    }

    @Override
    public List<DeptEntity> list() {
        return deptDao.findAll();
    }
}
