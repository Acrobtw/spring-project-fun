
package com.example.store.notification;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public interface NotificationService {
    void sendMessage(String message, String recipientEmail);
}