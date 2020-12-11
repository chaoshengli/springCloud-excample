package com.lcs.springcloud.service;

import com.lcs.springcloud.entities.DeptEntity;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

//feign作用，面向接口编程，进一步地访问到微服务。即通过微服务名称，调用到8001/8002/8003服务端的接口
@FeignClient(value = "LCS-SPRINGCLOUD-PROVIDE")
public interface DeptClientService {
    @PostMapping(value = "/dept/add")
    public boolean add(DeptEntity deptEntity);

    @RequestMapping(value = "/dept/get/{deptNo}", method = RequestMethod.GET)
    public DeptEntity get(@PathVariable("deptNo") Long deptNo);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<DeptEntity> findAll();


}
