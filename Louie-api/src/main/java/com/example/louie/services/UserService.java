package com.example.louie.services;

import com.example.louie.models.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {
    User createUser(User user);
}
