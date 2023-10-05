package com.crepic.api.service;

import com.crepic.api.model.User;
import com.crepic.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByUserAndPassword(String user, String password) {
        return userRepository.findByUserAndPassword(user, password);
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}
