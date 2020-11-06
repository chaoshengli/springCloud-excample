package com.lcs.springcloud.controller;

import com.lcs.springcloud.entities.DeptEntity;
import com.lcs.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    //    服务发现
    @Autowired
    private DiscoveryClient discoveryClient;


    // @RequestBody接收前端传递给后端的json字符串中的数据，用POST方式进行提交，不能使用GET方式，无请求体异常。
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

    /**
     * 功能描述: <br>
     * 〈查询eureka注册的服务信息〉
     *
     * @Param: []
     * @Return: java.lang.Object
     * @Date: 2020/11/3 15:39
     */
    @GetMapping(value = "/provider/discovery")
    public Object discovery() {
        List<String> discoveryClientServices = discoveryClient.getServices();
        System.out.println("总共有多少个微服务" + discoveryClientServices.size());

        //查询eureka注册的LCS-SPRINGCLOUD-PROVIDE 服务
        List<ServiceInstance> instances = discoveryClient.getInstances("LCS-SPRINGCLOUD-PROVIDE");
        for (ServiceInstance serv : instances) {
            System.out.println(serv.getServiceId() + "\n" + serv.getHost() + "\n" + serv.getPort() + "\n" + serv.getUri());
            System.out.println(serv.getMetadata());
        }
        return discoveryClientServices;
    }
}
