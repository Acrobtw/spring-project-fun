package com.example.store.registration;

import com.example.store.User;

public interface UserRepository {

    void save(User user);
    User findByEmail(String email);
}
