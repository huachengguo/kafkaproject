package com.wangcai.scheduling.scheduling;

import com.wangcai.scheduling.service.KafkaSendMarkeSellService;
import com.wangcai.scheduling.service.KafkaSendMarketService;
import com.wangcai.scheduling.service.KafkaSendSellService;
import com.wangcai.scheduling.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutionException;

@Component
public class KafkaTestScheduling {

    @Autowired
    KafkaService kafkaService;

    @Autowired
    KafkaSendSellService kafkaSendSellService;

    @Autowired
    KafkaSendMarketService kafkaSendMarketService;

    @Autowired
    KafkaSendMarkeSellService kafkaSendMarkeSellService;

    @Scheduled(fixedRate = 60000)
    public void timerToReport(){
        System.out.println("定时器1");
        try {
            kafkaService.sendMessage();

        }catch (Exception e)
        {
            System.out.println("定时器1"+e);
        }
    }

    @Scheduled(initialDelay= 4000,fixedRate = 60000)
    public void timerToReport2(){
        System.out.println("定时器2");
        try {
            kafkaSendSellService.sendSellMessage();

        }catch (Exception e)
        {
            System.out.println("定时器2"+e);
        }
    }

    @Scheduled(fixedRate = 6000000)
    public void timerToReport3(){
        System.out.println("定时器3");
        try {
            kafkaSendMarketService.sendMessage();
        }catch (Exception e)
        {
            System.out.println("定时器3"+e);
        }

    }

    @Scheduled(initialDelay= 3000,fixedRate = 60000)
    public void timerToReport4(){
        System.out.println("定时器4");
        try {
            kafkaSendMarkeSellService.sendSellMessage();

        }catch (Exception e)
        {
            System.out.println("定时器4"+e);
        }
    }
}
