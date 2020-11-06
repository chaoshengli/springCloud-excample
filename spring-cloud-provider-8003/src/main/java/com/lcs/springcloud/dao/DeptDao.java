package com.lcs.springcloud.dao;

import com.lcs.springcloud.entities.DeptEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

//mybatis操作持久层，方法命名尽量贴近jpa风格
@Mapper
@Component
//@Repository
public interface DeptDao {
    /**
     * 插入
     *
     * @param deptEntity
     * @return
     */
    boolean addDept(DeptEntity deptEntity);

    /**
     * 根据id查找
     *
     * @param deptNo
     * @return
     */
    DeptEntity findById(Long deptNo);

    /**
     * 查询全部
     *
     * @return
     */
    List<DeptEntity> findAll();
}
