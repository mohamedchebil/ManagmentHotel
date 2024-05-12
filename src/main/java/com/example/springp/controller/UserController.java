package com.example.springp.controller;

import com.example.springp.entity.User;
import com.example.springp.repository.UserRepository;
import com.example.springp.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")

public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/UserInfo")
    public User getUserInfo(@RequestParam("id") Long userid) {
        User user = userRepository.findById(userid).orElse(null);
        System.out.println(user.getEmail());
        return user;

    }


    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUserInfo(@PathVariable Long id, @RequestBody User updatedUserInfo) {
        // Find the existing user by ID
        java.util.Optional<User> optionalUser = userRepository.findById(id);

        if (optionalUser.isPresent()) {
            User existingUser = optionalUser.get();

            // Update user information
            existingUser.setName(updatedUserInfo.getName());
            existingUser.setUsername(updatedUserInfo.getUsername());
            existingUser.setEmail(updatedUserInfo.getEmail());
            existingUser.setPassword(updatedUserInfo.getPassword());




            // Save the updated user to the database
            userRepository.save(existingUser);

            return ResponseEntity.ok(existingUser);
        } else {
            // User with the given ID not found
            return ResponseEntity.notFound().build();
        }
    }

}