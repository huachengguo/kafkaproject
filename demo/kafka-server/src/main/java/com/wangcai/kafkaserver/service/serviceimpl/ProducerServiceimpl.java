package com.wangcai.kafkaserver.service.serviceimpl;

import com.wangcai.kafkaserver.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.FailureCallback;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.SuccessCallback;

@Service
public class ProducerServiceimpl implements ProducerService {

    @Autowired
    KafkaTemplate kafkaTemplate;
//    @Autowired
//    ListenableFuture listenableFuture;

    @Override
    public void sendMessage(String topic, Object message) {

       /* listenableFuture =*/ kafkaTemplate.send(topic,message);
        System.out.println("消息topic:"+topic+"消息内容为："+message);


    }

    @Override
    public void sendMessage(String topic, int position, Object key, Object message) {

       /* listenableFuture =*/ kafkaTemplate.send(topic,position,key,message);
        System.out.println("消息topic:"+topic+"消息内容为："+message);
        /*listenableFuture.addCallback(successCallback,failureCallback);*/

    }

    @Override
    public void sendMessage(String topic, Object key, Object Message) {

       /* listenableFuture = */kafkaTemplate.send(topic,key,Message);
        System.out.println("消息topic:"+topic+"消息内容为："+Message);
        /*listenableFuture.addCallback(successCallback,failureCallback);*/

    }

    //发送成功后回调
    SuccessCallback successCallback = new SuccessCallback() {
        @Override
        public void onSuccess(Object result) {

        }
    };

    //发送失败回调
    FailureCallback failureCallback = new FailureCallback() {
        @Override
        public void onFailure(Throwable ex) {
        }
    };
}
