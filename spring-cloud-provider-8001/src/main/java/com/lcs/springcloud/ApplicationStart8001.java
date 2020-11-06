package com.lcs.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient //eureka服务发现(EnableEurekaClient注解包含有EnableDiscoveryClient注解）
public class ApplicationStart8001 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart8001.class);
    }
}
