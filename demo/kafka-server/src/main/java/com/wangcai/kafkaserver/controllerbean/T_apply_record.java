package com.wangcai.kafkaserver.controllerbean;

import org.springframework.stereotype.Component;

@Component
public class T_apply_record {
    Integer auto_id;
    String apply_id;
    Integer user_id;
    String trade_type;
    String symbol;
    String num;
    Integer trade_status;
    String create_time;
    String update_time;
    Integer is_del;
    String trade_num;
    String apply_price;
    String total_price;
    String base_symbol;
    String deal_price;
    String no_trade_num;
    String trade_price_avg;
    Integer apply_type;

    public T_apply_record() {
    }

    public String getDeal_price() {
        return deal_price;
    }

    public void setDeal_price(String deal_price) {
        this.deal_price = deal_price;
    }



    public String getNo_trade_num() {
        return no_trade_num;
    }

    public void setNo_trade_num(String no_trade_num) {
        this.no_trade_num = no_trade_num;
    }

    public String getTrade_price_avg() {
        return trade_price_avg;
    }

    public void setTrade_price_avg(String trade_price_avg) {
        this.trade_price_avg = trade_price_avg;
    }

    public Integer getApply_type() {
        return apply_type;
    }

    public void setApply_type(Integer apply_type) {
        this.apply_type = apply_type;
    }

    public Integer getAuto_id() {
        return auto_id;
    }

    public void setAuto_id(Integer auto_id) {
        this.auto_id = auto_id;
    }

    public String getBase_symbol() { return base_symbol; }

    public void setBase_symbol(String base_symbol) { this.base_symbol = base_symbol; }

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getTotal_price() {
        return total_price;
    }

    public void setTotal_price(String total_price) {
        this.total_price = total_price;
    }

    public String getApply_price() {
        return apply_price;
    }

    public void setApply_price(String apply_price) {
        this.apply_price = apply_price;
    }

    public String getTrade_num() {
        return trade_num;
    }

    public void setTrade_num(String trade_num) {
        this.trade_num = trade_num;
    }

    public String getApply_id() {
        return apply_id;
    }

    public void setApply_id(String apply_id) {
        this.apply_id = apply_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }



    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Integer getTrade_status() {
        return trade_status;
    }

    public void setTrade_status(Integer trade_status) {
        this.trade_status = trade_status;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public Integer getIs_del() {
        return is_del;
    }

    public void setIs_del(Integer is_del) {
        this.is_del = is_del;
    }
}
