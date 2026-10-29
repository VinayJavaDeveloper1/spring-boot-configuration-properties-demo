package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class PaymentGatway {

    private PaymentProperties paymentProperties;

    public PaymentGatway(PaymentProperties paymentProperties){
        this.paymentProperties= paymentProperties;

    }
    public String getType() {
        return paymentProperties.getType();
    }

    public int getRetryCount() {
        return paymentProperties.getRetryCount();
    }

    public boolean isEnable() {
        return paymentProperties.isEnabled();
    }

    public int getTimeout() {
        return paymentProperties.getTimeout();
    }

    public void print(){
        System.out.println(getType());
        System.out.println(getRetryCount());
        System.out.println(isEnable());
        System.out.println(getTimeout());

    }

//    private String Type;
//    private  int RetryCount;
//
//    public PaymentGatway(@Value("${paymentGatway.type}") String type,
//                         @Value("${paymentGatway.retry-count}")int retryCount) {
//        Type = type;
//        RetryCount = retryCount;
//    }

//    public int getRetryCount() {
//        return RetryCount;
//    }
//
//    public void setRetryCount(int retryCount) {
//        RetryCount = retryCount;
//    }
//
//    public String getType() {
//        return Type;
//    }
//
//    public void setType(String type) {
//        Type = type;
//    }

}


