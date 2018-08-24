package com.wangcai.kafkaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableDiscoveryClient
@EnableKafka
@ComponentScan(basePackages = {"com.wangcai"})
public class KafkaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaServerApplication.class, args);
    }
}
