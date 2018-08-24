package com.wangcai.kafkaserver.service;


import org.springframework.stereotype.Service;

@Service
public interface ProducerService {

    void sendMessage(String topic, Object message);

    void sendMessage(String topic, int position, Object key, Object message);

    void sendMessage(String topic, Object key, Object Message);

}
