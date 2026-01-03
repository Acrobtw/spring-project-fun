package com.example.store.registration;

import org.springframework.stereotype.Service;

import com.example.store.User;
import com.example.store.notification.NotificationService;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final NotificationService notificationServce;

    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationServce = notificationService;
    }


    public void registerUser(User user) {
        if(userRepository.findByEmail(user.getEmail()) != null) {
            throw new IllegalArgumentException("User with email " + user.getEmail() + " already exists");
    }
    userRepository.save(user);
    notificationServce.sendMessage("You registered successfully!", user.getEmail());
}
}
