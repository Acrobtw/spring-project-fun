package com.example.store.notification;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("sms")
public class SmsNotifactionService implements NotificationService {

    @Override
    public void sendMessage(String message, String recipientNumber) {
        System.out.print("Sending SMS: " + message + " to " + recipientNumber);
    }

    
}
