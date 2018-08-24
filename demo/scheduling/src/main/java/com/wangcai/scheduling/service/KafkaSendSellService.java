package com.wangcai.scheduling.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "kafka-client")
public interface KafkaSendSellService {
    @RequestMapping("/send_sell")
    public String sendSellMessage();
}
