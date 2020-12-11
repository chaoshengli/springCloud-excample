package com.lcs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.lcs.springcloud")
@ComponentScan("com.lcs.springcloud")
//@RibbonClient(name = "LCS-SPRINGCLOUD-PROVIDE",configuration = MySlefRule.class)//使用自定义ribbon配置类，启动服务时加载，使配置生效
//@MapperScan(basePackages = "com.lcs.springcloud.dao") springboot整合mybatis默认配置了@MapperScan
public class ApplicationStart_feign {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart_feign.class);
    }
}
