package com.wangcai.kafkaserver.service;

import com.alibaba.fastjson.JSONObject;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KafkaConsumerService {

//    @Autowired
//    KafkaTemplate kafkaTemplate;
    @Autowired
    ConsumerService consumerService;


//    @KafkaListener(topics ={"${spring.kafka.consumer.topic_buy}","${spring.kafka.consumer.topic_sell}","${spring.kafka.consumer.topic_cancel}"})              //  @KafkaListener(topics ={"${spring.kafka.consumer.topic_buy}","${spring.kafka.consumer.topic_sell}","${spring.kafka.consumer.topic_cancel}"})
    public void consumerMsg_buy(List <ConsumerRecord> records , Acknowledgment ack) {
        try {

            StringBuffer printStream = new StringBuffer();
            for (ConsumerRecord record : records) {
                printStream.append(String.format("offset = %d, key = %s, value = %s%n \n", record.offset(), record.key(), record.value()));
                consumerService.consumer();
//                consumerService.topicConsumerBuy(record.topic(),JSONObject.toJSONString(record.value()));
            }
            System.out.println(printStream);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ack.acknowledge();//手动提交偏移量
        }
    }

}
