package com.lcs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import rule.MySlefRule;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "LCS-SPRINGCLOUD-PROVIDE",configuration = MySlefRule.class)//使用自定义ribbon配置类，启动服务时加载，使配置生效
//@MapperScan(basePackages = "com.lcs.springcloud.dao") springboot整合mybatis默认配置了@MapperScan
public class ApplicationStart80 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart80.class);
    }
}
