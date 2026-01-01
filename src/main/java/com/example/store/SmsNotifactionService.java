package com.example.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("sms")
public class SmsNotifactionService implements NotificationService {

    @Override
    public void sendMessage(String message) {
        System.out.print("Sending SMS: " + message);
    }
    
}
