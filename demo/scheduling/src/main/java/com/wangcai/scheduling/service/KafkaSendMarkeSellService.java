package com.wangcai.scheduling.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.awt.SunHints;

@Component
@FeignClient(value = "kafka-client")
public interface KafkaSendMarkeSellService {
    @RequestMapping("/send_market_sell")
    public String sendSellMessage();
}
