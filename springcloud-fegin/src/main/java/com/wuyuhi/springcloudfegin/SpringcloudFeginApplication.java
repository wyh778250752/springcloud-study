package com.wuyuhi.springcloudfegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringcloudFeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFeginApplication.class, args);
    }

}
