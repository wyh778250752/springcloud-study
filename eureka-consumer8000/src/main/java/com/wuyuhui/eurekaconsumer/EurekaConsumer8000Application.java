package com.wuyuhui.eurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaConsumer8000Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumer8000Application.class, args);
    }

}
