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

    public User create(User user) {
        return userRepository.save(user);
    }

    public void delete(Long userId) {
        userRepository.deleteById(userId);
    }

    public User update(Long userId, User updateData) {
        User userToUpdate = userRepository.getReferenceById(userId);
        updateData(userToUpdate, updateData);
        return userRepository.save(userToUpdate);
    }

    private void updateData(User userToUpdate, User updateData) {
        userToUpdate.setName(updateData.getName());
        userToUpdate.setEmail(updateData.getEmail());
        userToUpdate.setPhone(updateData.getPhone());
    }
}
