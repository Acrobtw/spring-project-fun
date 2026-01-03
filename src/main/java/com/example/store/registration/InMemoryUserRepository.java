package com.example.store.registration;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

import com.example.store.User;

@Repository
public class InMemoryUserRepository implements UserRepository {
    private final Map<String, User> users = new ConcurrentHashMap<>();

    @Override
    public void save(User user) {
        System.out.println("User saved with email: " + user);
        users.put(user.getEmail(),user);    
    }

    @Override
    public User findByEmail(String email) {
        return users.getOrDefault(email, null);
    }
}
