package com.wangcai.kafkaserver.controllerbean;

import java.io.Serializable;

public class MobileKafkaReq implements Serializable {

    private String topic;

    private Integer position;

    private Object key;

    private Object message;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}
