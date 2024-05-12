package com.neto.cursoneliowebservices.services;

import com.neto.cursoneliowebservices.entities.User;
import com.neto.cursoneliowebservices.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    public User findById(Long id) {
        return this.userRepository.findById(id).get();
    }
}
