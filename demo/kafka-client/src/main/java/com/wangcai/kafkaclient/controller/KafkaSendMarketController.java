package com.wangcai.kafkaclient.controller;

import com.wangcai.kafkaclient.service.KafkaSendMarkBuyMessage;
import com.wangcai.kafkaclient.service.KafkaSendMarkSellerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaSendMarketController {

    @Autowired
    KafkaSendMarkBuyMessage KafkaSendMarkBuyMessage;

    @Autowired
    KafkaSendMarkSellerMessage kafkaSendMarkSellerMessage;

    @RequestMapping("/send_market_buy")
    public String sendMessage()
    {
        try {
            KafkaSendMarkBuyMessage.sendMarketMsg();
        }catch (Exception e)
        {
            System.out.println("client错误"+e);
            return "发送消息失败"+e;
        }

        return "消息发送成功";
    }

    @RequestMapping("/send_market_sell")
    public String sendSellMessage()
    {
        try {
            kafkaSendMarkSellerMessage.sendMarketMsg();
        }catch (Exception e)
        {
            System.out.println("client错误"+e);
            return "发送消息失败"+e;
        }

        return "消息发送成功";
    }
}
