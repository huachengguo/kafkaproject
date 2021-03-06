package com.wangcai.kafkaclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "kafka-server")
public interface KafkaSendMarkSellerMessage {
    @RequestMapping("kafka_market_send_sell")
    public String sendMarketMsg();
}
