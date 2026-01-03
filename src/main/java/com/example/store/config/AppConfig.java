package com.example.store.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.resilience.annotation.ConcurrencyLimit;

import com.example.store.service.OrderService;
import com.example.store.service.PayPalPaymentService;
import com.example.store.service.PaymentService;
import com.example.store.service.StripePaymentService;

@Configuration
public class AppConfig {
    @Value("${payment-gateway}")
    private String paymentGateway;
    
    @Bean
    public PaymentService stripe() {
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal() {
        return new PayPalPaymentService();
    }

    @Bean
    public OrderService orderService() {
        if(paymentGateway.equals("stripe"))
            return new OrderService(stripe());
        else
            return new OrderService(paypal());
    }
}
