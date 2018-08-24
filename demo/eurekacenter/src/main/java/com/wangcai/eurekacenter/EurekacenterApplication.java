package com.wangcai.eurekacenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekacenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekacenterApplication.class, args);
    }
}
