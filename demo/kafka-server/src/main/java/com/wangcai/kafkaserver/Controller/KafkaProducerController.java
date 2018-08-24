package com.wangcai.kafkaserver.Controller;

import com.alibaba.fastjson.JSONObject;
import com.wangcai.kafkaserver.controllerbean.MobileKafkaReq;
import com.wangcai.kafkaserver.controllerbean.T_apply_record;
import com.wangcai.kafkaserver.service.ProducerService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class KafkaProducerController {

    @Autowired
    ProducerService producerService;

    @RequestMapping("/kafka_send_buy")
    public String sendMsg() {
        for (int i = 0; i < 1000; i++) {
            if (i > 0 && i < 250) {
                T_apply_record record = new T_apply_record();
                record.setApply_price("1.11");
                record.setSymbol("AE");
                record.setNum(20 + i + "");
                record.setTrade_type("B");
                record.setApply_type(0);
                record.setTotal_price(10 + i + "");
                record.setUser_id(158);
                try {
                    producerService.sendMessage("tradechannel_buy", 1, "B", JSONObject.toJSONString(record));
                } catch (Exception e) {
                    System.out.println(i+"消息发送失败"+e);
                }

            }
            if (i>250&&i<500)
            {
                T_apply_record record = new T_apply_record();
                record.setApply_price("1.11");
                record.setSymbol("AE");
                record.setNum(20 + i + "");
                record.setTrade_type("B");
                record.setApply_type(0);
                record.setTotal_price(10 + i + "");
                record.setUser_id(161);
                try {
                    producerService.sendMessage("tradechannel_buy", 1, "B", JSONObject.toJSONString(record));
                } catch (Exception e) {
                    System.out.println(i+"消息发送失败"+e);
                }
            }
            if (i>500&&i<750)
            {
                T_apply_record record = new T_apply_record();
                record.setApply_price("1.11");
                record.setSymbol("AE");
                record.setNum(20 + i + "");
                record.setTrade_type("B");
                record.setApply_type(0);
                record.setTotal_price(10 + i + "");
                record.setUser_id(186);
                try {
                    producerService.sendMessage("tradechannel_buy", 1, "B", JSONObject.toJSONString(record));
                } catch (Exception e) {
                    System.out.println(i+"消息发送失败"+e);
                }
            }
            if (i>750&&i<1000)
            {
                T_apply_record record = new T_apply_record();
                record.setApply_price("1.11");
                record.setSymbol("AE");
                record.setNum(20 + i + "");
                record.setTrade_type("B");
                record.setApply_type(0);
                record.setTotal_price(10 + i + "");
                record.setUser_id(185);
                try {
                    producerService.sendMessage("tradechannel_buy", 1, "B", JSONObject.toJSONString(record));
                } catch (Exception e) {
                    System.out.println(i+"消息发送失败"+e);
                }
            }
        }
        System.out.println("消息发送成功");

        return "消息发送成功";
    }

    @RequestMapping("/kafka_send_sell")
    public String sendSellMsg() {
        for (int i = 0; i < 1000; i++) {
            if (i > 0 && i < 250) {
                T_apply_record record = new T_apply_record();
                record.setApply_price("1.1001");
                record.setSymbol("AE");
                record.setNum(20 + i + "");
                record.setTrade_type("S");
                record.setApply_type(0);
                record.setTotal_price(10 + i + "");
                record.setUser_id(158);
                try {
                    producerService.sendMessage("tradechannel_buy", 1, "B", JSONObject.toJSONString(record));
                } catch (Exception e) {
                    System.out.println(i+"消息发送失败"+e);
                }

            }
            if (i>250 && i<500 )
            {
                T_apply_record record = new T_apply_record();
                record.setApply_price("1.1001");
                record.setSymbol("AE");
                record.setNum(20 + i + "");
                record.setTrade_type("S");
                record.setApply_type(0);
                record.setTotal_price(10 + i + "");
                record.setUser_id(161);
                try {
                    producerService.sendMessage("tradechannel_buy", 1, "B", JSONObject.toJSONString(record));
                } catch (Exception e) {
                    System.out.println(i+"消息发送失败"+e);
                }
            }
            if (i>500&& i<750)
            {
                T_apply_record record = new T_apply_record();
                record.setApply_price("1.1001");
                record.setSymbol("AE");
                record.setNum(20 + i + "");
                record.setTrade_type("S");
                record.setApply_type(0);
                record.setTotal_price(10 + i + "");
                record.setUser_id(185);
                try {
                    producerService.sendMessage("tradechannel_buy", 1, "B", JSONObject.toJSONString(record));
                } catch (Exception e) {
                    System.out.println(i+"消息发送失败"+e);
                }
            }
            if (i>750&&i<1000)
            {
                T_apply_record record = new T_apply_record();
                record.setApply_price("1.1001");
                record.setSymbol("AE");
                record.setNum(20 + i + "");
                record.setTrade_type("S");
                record.setApply_type(0);
                record.setTotal_price(10 + i + "");
                record.setUser_id(186);
                try {
                    producerService.sendMessage("tradechannel_buy", 1, "B", JSONObject.toJSONString(record));
                } catch (Exception e) {
                    System.out.println(i+"消息发送失败"+e);
                }
            }
        }
        System.out.println("消息发送成功");

        return "消息发送成功";
    }

    @RequestMapping("/kafka_market_send_buy")
    public String sendMarketMsg() {
        for (int i = 0; i < 1000; i++) {
            if (i > 0 && i < 250) {
                T_apply_record record = new T_apply_record();
                record.setApply_price("1.11");
                record.setSymbol("AE");
                record.setNum(20 + i + "");
                record.setTrade_type("B");
                record.setApply_type(1);
                record.setTotal_price(10 + i + "");
                record.setUser_id(161);
                try {
                    producerService.sendMessage("tradechannel_buy", 1, "B", JSONObject.toJSONString(record));
                } catch (Exception e) {
                    System.out.println(i+"消息发送失败"+e);
                }

            }
            if (i > 250 && i < 500) {
                T_apply_record record = new T_apply_record();
                record.setApply_price("1.11");
                record.setSymbol("AE");
                record.setNum(20 + i + "");
                record.setTrade_type("B");
                record.setApply_type(1);
                record.setTotal_price(10 + i + "");
                record.setUser_id(158);
                try {
                    producerService.sendMessage("tradechannel_buy", 1, "B", JSONObject.toJSONString(record));
                } catch (Exception e) {
                    System.out.println(i+"消息发送失败"+e);
                }

            }
            if (i > 500 && i < 750) {
                T_apply_record record = new T_apply_record();
                record.setApply_price("1.11");
                record.setSymbol("AE");
                record.setNum(20 + i + "");
                record.setTrade_type("B");
                record.setApply_type(1);
                record.setTotal_price(10 + i + "");
                record.setUser_id(185);
                try {
                    producerService.sendMessage("tradechannel_buy", 1, "B", JSONObject.toJSONString(record));
                } catch (Exception e) {
                    System.out.println(i+"消息发送失败"+e);
                }

            }
            if (i > 750 && i < 1000) {
                T_apply_record record = new T_apply_record();
                record.setApply_price("1.11");
                record.setSymbol("AE");
                record.setNum(20 + i + "");
                record.setTrade_type("B");
                record.setApply_type(1);
                record.setTotal_price(10 + i + "");
                record.setUser_id(186);
                try {
                    producerService.sendMessage("tradechannel_buy", 1, "B", JSONObject.toJSONString(record));
                } catch (Exception e) {
                    System.out.println(i+"消息发送失败"+e);
                }

            }
        }
        System.out.println("消息发送成功");

        return "消息发送成功";
    }

    @RequestMapping("/kafka_market_send_sell")
    public String sendMarketSellMsg() {
        for (int i = 0; i < 1000; i++) {
            if (i > 0 && i < 250) {
                T_apply_record record = new T_apply_record();
                record.setApply_price("1.1001");
                record.setSymbol("AE");
                record.setNum(20 + i + "");
                record.setTrade_type("S");
                record.setApply_type(1);
                record.setTotal_price(10 + i + "");
                record.setUser_id(158);
                try {
                    producerService.sendMessage("tradechannel_buy", 1, "B", JSONObject.toJSONString(record));
                } catch (Exception e) {
                    System.out.println(i+"消息发送失败"+e);
                }

            }
            if (i > 250 && i < 500) {
                T_apply_record record = new T_apply_record();
                record.setApply_price("1.1001");
                record.setSymbol("AE");
                record.setNum(20 + i + "");
                record.setTrade_type("S");
                record.setApply_type(1);
                record.setTotal_price(10 + i + "");
                record.setUser_id(161);
                try {
                    producerService.sendMessage("tradechannel_buy", 1, "B", JSONObject.toJSONString(record));
                } catch (Exception e) {
                    System.out.println(i+"消息发送失败"+e);
                }

            }
            if (i > 500 && i < 750) {
                T_apply_record record = new T_apply_record();
                record.setApply_price("1.1001");
                record.setSymbol("AE");
                record.setNum(20 + i + "");
                record.setTrade_type("S");
                record.setApply_type(1);
                record.setTotal_price(10 + i + "");
                record.setUser_id(185);
                try {
                    producerService.sendMessage("tradechannel_buy", 1, "B", JSONObject.toJSONString(record));
                } catch (Exception e) {
                    System.out.println(i+"消息发送失败"+e);
                }

            }
            if (i > 750 && i < 1000) {
                T_apply_record record = new T_apply_record();
                record.setApply_price("1.1001");
                record.setSymbol("AE");
                record.setNum(20 + i + "");
                record.setTrade_type("S");
                record.setApply_type(1);
                record.setTotal_price(10 + i + "");
                record.setUser_id(186);
                try {
                    producerService.sendMessage("tradechannel_buy", 1, "B", JSONObject.toJSONString(record));
                } catch (Exception e) {
                    System.out.println(i+"消息发送失败"+e);
                }

            }
        }
        System.out.println("消息发送成功");

        return "消息发送成功";
    }
}
