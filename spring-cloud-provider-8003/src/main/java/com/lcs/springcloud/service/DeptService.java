package com.lcs.springcloud.service;

import com.lcs.springcloud.entities.DeptEntity;

import java.util.List;
//命名尽量贴近restful风格

public interface DeptService {
    /**
     * 插入
     *
     * @param deptEntity
     * @return
     */
    boolean add(DeptEntity deptEntity);

    /**
     * 根据id查找
     *
     * @param deptNo
     * @return
     */
    DeptEntity get(Long deptNo);

    /**
     * 查询全部
     *
     * @return
     */
    List<DeptEntity> list();

}
