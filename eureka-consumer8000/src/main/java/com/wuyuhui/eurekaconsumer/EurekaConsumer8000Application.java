package com.wuyuhui.eurekaconsumer;

import com.wuyuhui.common.feign.AddressFeignService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.DefaultFeignLoggerFactory;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(clients = AddressFeignService.class)
public class EurekaConsumer8000Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumer8000Application.class, args);
    }

}
