package com.example.store.notification;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService {

    @Value("${mail.host}")
    private String host;

    @Value("${mail.port}")
    private String port;

    @Override
    public void sendMessage(String message, String recipientEmail) {
        System.out.println("Sending email: " + message + " to " + recipientEmail);
        System.out.println("Host: " + host);
        System.out.print("Port: " + port);
    }
    
}