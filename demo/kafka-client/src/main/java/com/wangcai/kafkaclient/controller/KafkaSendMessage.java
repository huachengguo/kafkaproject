package com.wangcai.kafkaclient.controller;

import com.wangcai.kafkaclient.service.KafkaSendSellMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaSendMessage {

    @Autowired
    KafkaSendMessage kafkaSendMessage;

    @Autowired
    KafkaSendSellMessage kafkaSendSellMessage;

    @RequestMapping("/send_buy")
    public String sendMessage()
    {
        try {
            kafkaSendMessage.sendMessage();
        }catch (Exception e)
        {
            System.out.println("client错误"+e);
            return "发送消息失败"+e;

        }

        return "消息发送成功";
    }

    @RequestMapping("/send_sell")
    public String sendSellMessage()
    {
        try {
            kafkaSendSellMessage.sendMsg();
        }catch (Exception e)
        {
            System.out.println("client错误"+e);
            return "发送消息失败"+e;
        }

        return "消息发送成功";
    }
}
