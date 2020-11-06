package com.lcs.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //启用eureka,访问http://localhost:7002注册中心
public class ApplicationStart7002 {
    public static void main(String[] args) {
//        SpringApplication.run(ApplicationStart7001.class,args); 两种方式
        new SpringApplicationBuilder(ApplicationStart7002.class).web(true).run(args);
    }
}
