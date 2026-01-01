package com.example.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class NotificationManager {
    private final NotificationService notificationService;


    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendMessage(String message) {
        notificationService.sendMessage(message);
    }
}
