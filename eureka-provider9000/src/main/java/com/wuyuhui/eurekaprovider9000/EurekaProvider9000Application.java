package com.wuyuhui.eurekaprovider9000;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@MapperScan("com.wuyuhui.eurekaprovider9000.mapper")
public class EurekaProvider9000Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProvider9000Application.class, args);
    }

}
