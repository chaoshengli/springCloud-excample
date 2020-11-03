package com.lcs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //启用eureka,访问http://localhost:7001注册中心
public class ApplicationStart7001 {
    public static void main(String[] args) {
//        SpringApplication.run(ApplicationStart7001.class,args); 两种方式
        new SpringApplicationBuilder(ApplicationStart7001.class).web(true).run(args);
    }
}
