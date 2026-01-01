package com.example.store;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service("stripe")
@Primary

public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout}")
    private int timeout;

    @Value("${stripe.supported-currentices}")
    private List<String> supportedCurrencies;

    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Api url " + apiUrl);
        System.out.println("timeout: " + timeout);
        System.out.println("enabled" + enabled);
        System.out.println("List of supported Currencies: " + supportedCurrencies);
        System.out.println("Amount: " + amount + " paid.");
    }
    
}
