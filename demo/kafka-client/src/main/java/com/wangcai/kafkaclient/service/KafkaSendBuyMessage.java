package com.wangcai.kafkaclient.service;

import com.wangcai.kafkaclient.controllerbean.MobileKafkaReq;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "kafka-server")
public interface KafkaSendBuyMessage {
    @RequestMapping("/kafka_send_buy")
    public String sendMsg();
}
