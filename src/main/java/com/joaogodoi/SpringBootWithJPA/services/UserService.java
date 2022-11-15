package com.joaogodoi.SpringBootWithJPA.services;

import com.joaogodoi.SpringBootWithJPA.entities.User;
import com.joaogodoi.SpringBootWithJPA.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long UserId) {
        Optional<User> userById = userRepository.findById(UserId);
        return userById.get();
    }

}
