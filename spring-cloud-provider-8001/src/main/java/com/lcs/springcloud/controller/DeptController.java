package com.lcs.springcloud.controller;

import com.lcs.springcloud.entities.DeptEntity;
import com.lcs.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    //  RequestBody接收前端传递给后端的json字符串中的数据，用POST方式进行提交，不能使用GET方式，无请求体。
    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody DeptEntity deptEntity) {
        return deptService.add(deptEntity);
    }

    //动态请求：/dept/get+任意值
    @GetMapping(value = "/dept/get/{id}")
    public DeptEntity get(@PathVariable Long id) {
        return deptService.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET) //另一种方式
    public List<DeptEntity> list() {
        return deptService.list();
    }
}
