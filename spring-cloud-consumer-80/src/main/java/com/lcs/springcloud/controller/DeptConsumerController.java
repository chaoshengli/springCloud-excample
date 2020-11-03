package com.lcs.springcloud.controller;

import com.lcs.springcloud.entities.DeptEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {

    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX="http://localhost:8001/dept/list";

    @GetMapping(value = "/consumer/dept/list")
    public List<DeptEntity> list() {
        //用get/postForObject取决于提供方的controller层用了什么
        System.out.println(REST_URL_PREFIX);
        return restTemplate.getForObject(REST_URL_PREFIX,List.class);
    }
}
    //Caused by: java.lang.IllegalStateException: No instances available for localhost
