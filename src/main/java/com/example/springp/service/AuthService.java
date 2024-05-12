package com.example.springp.service;


import com.example.springp.dto.LoginDto;
import com.example.springp.entity.User;

import java.util.Optional;

public interface AuthService {
    String login(LoginDto loginDto);
    Optional<User> findById(Long id) ;


}
