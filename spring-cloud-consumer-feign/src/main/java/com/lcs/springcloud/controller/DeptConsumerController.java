package com.lcs.springcloud.controller;

import com.lcs.springcloud.entities.DeptEntity;
import com.lcs.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptConsumerController {

    @Autowired
    private DeptClientService deptClientService = null;
//    private RestTemplate restTemplate;

    //    private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://LCS-SPRINGCLOUD-PROVIDE"; //访问eureka的微服务名

    @RequestMapping(value = "/consumer/dept/add") //前端请求url
    public Object add(DeptEntity deptEntity) {
        return deptClientService.add(deptEntity); //调公共api接口
        //三个参数：url,requestMap ResponseBean.class
        /*return  restTemplate.postForObject(
                REST_URL_PREFIX+"/dept/add",
                deptEntity,
                Boolean.class);*/
    }

    @RequestMapping(value = "/consumer/dept/findById/{deptNo}",method= RequestMethod.GET)//http://localhost/consumer/dept/findById/2
    public DeptEntity findById(@PathVariable("deptNo") Long deptNo) {
        System.out.println("=============="+deptNo);
        return deptClientService.get(deptNo);
    }

    @GetMapping(value = "/consumer/dept/list")
    public List<DeptEntity> list() {
        return deptClientService.findAll();
    }

    /**
     * 功能描述: <br>
     * 〈查询eureka注册中心服务发现〉
     *
     * @Param: []
     * @Return: java.lang.Object
     * @Author: lichaosheng
     * @Date: 2020/11/3 16:57
     */
    /*@GetMapping(value = "/consumer/dept/discovery")
    public Object discovery() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/provider/discovery", Object.class);
    }*/
}
/**
 * 客户端访问eureka注册中心集群的某台，然后再调某台微服务器，通过测试，看datasource字段可以看出调了不同服务器的数据库。
 */
