package com.example.louie.services.impl;

import com.example.louie.models.User;
import com.example.louie.repositorys.UserRepository;
import com.example.louie.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User createUser( User user) {
        userRepository.save(user);
        return user;
    }
}
