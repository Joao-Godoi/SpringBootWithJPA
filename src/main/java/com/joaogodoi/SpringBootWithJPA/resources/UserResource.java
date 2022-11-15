package com.joaogodoi.SpringBootWithJPA.resources;

import com.joaogodoi.SpringBootWithJPA.entities.User;
import com.joaogodoi.SpringBootWithJPA.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserResource {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        List<User> allUsers = userService.findAll();
        return ResponseEntity.ok().body(allUsers);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User userById = userService.findById(id);
        return ResponseEntity.ok().body(userById);
    }
}
