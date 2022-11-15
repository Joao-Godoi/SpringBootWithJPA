package com.joaogodoi.SpringBootWithJPA.services;

import com.joaogodoi.SpringBootWithJPA.entities.User;
import com.joaogodoi.SpringBootWithJPA.repositories.UserRepository;
import com.joaogodoi.SpringBootWithJPA.services.exceptions.DatabaseException;
import com.joaogodoi.SpringBootWithJPA.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
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

    public User findById(Long userId) {
        Optional<User> userById = userRepository.findById(userId);
        return userById.orElseThrow(() -> new ResourceNotFoundException(userId));
    }

    public User create(User user) {
        return userRepository.save(user);
    }

    public void delete(Long userId) {
        try {
            userRepository.deleteById(userId);
        } catch (EmptyResultDataAccessException error) {
            throw new ResourceNotFoundException(userId);
        } catch (DataIntegrityViolationException error) {
            throw new DatabaseException(error.getMessage());
        }
    }

    public User update(Long userId, User updateData) {
        try {
            User userToUpdate = userRepository.getReferenceById(userId);
            updateData(userToUpdate, updateData);
            return userRepository.save(userToUpdate);
        } catch (EntityNotFoundException error) {
            throw new ResourceNotFoundException(userId);
        }
    }

    private void updateData(User userToUpdate, User updateData) {
        userToUpdate.setName(updateData.getName());
        userToUpdate.setEmail(updateData.getEmail());
        userToUpdate.setPhone(updateData.getPhone());
    }
}
