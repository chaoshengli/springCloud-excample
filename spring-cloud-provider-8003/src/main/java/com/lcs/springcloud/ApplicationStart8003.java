package com.lcs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient //eureka服务发现(EnableEurekaClient注解包含有EnableDiscoveryClient注解）
public class ApplicationStart8003 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart8003.class);
    }
}
