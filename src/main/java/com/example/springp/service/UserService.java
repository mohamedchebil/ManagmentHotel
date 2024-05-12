package com.example.springp.service;

import com.example.springp.entity.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findById(Long id) ;
    User save(User user);



}
