package com.example.springp.controller;

import com.example.springp.dto.LoginDto;
import com.example.springp.entity.User;
import com.example.springp.security.JWTAuthResponse;
import com.example.springp.service.AuthService;
import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {

    private AuthService authService;

    // Build Login REST API
    @PostMapping("/login")
    public ResponseEntity<String> authenticate(@RequestBody LoginDto loginDto) {
        String token = authService.login(loginDto);

        JWTAuthResponse jwtAuthResponse = new JWTAuthResponse();
        jwtAuthResponse.setAccessToken(token);

        return ResponseEntity.ok(token);
    }

    /*  @GetMapping("/UserInfo")
      public ResponseEntity<User> getUserInfo(@RequestParam("id") Long id, Authentication authentication) {
          java.util.Optional<User> user = authService.findById(id);

          if (authentication instanceof AnonymousAuthenticationToken) {
              return ResponseEntity.ok(user.get());
          } else {
              return ResponseEntity.notFound().build();
          }
      }*/
    @GetMapping("/UserInfo")
    public User getUserInfo(@RequestParam("id") Long id, Authentication authentication) {
        java.util.Optional<User> user = authService.findById(id);
        if (authentication instanceof AnonymousAuthenticationToken) {
            return user.orElse(null);
        } else{
            return  null;
        }
    }
}