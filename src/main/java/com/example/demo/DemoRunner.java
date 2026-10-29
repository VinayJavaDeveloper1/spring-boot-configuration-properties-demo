package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements ApplicationRunner {

    private PaymentGatway paymentGatway;

    public DemoRunner(PaymentGatway paymentGatway){
        this.paymentGatway = paymentGatway;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        paymentGatway.print();
    }
}