package com.wuyuhui.eruekaprovider9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EruekaProvider9001Application {

    public static void main(String[] args) {
        SpringApplication.run(EruekaProvider9001Application.class, args);
    }

}
