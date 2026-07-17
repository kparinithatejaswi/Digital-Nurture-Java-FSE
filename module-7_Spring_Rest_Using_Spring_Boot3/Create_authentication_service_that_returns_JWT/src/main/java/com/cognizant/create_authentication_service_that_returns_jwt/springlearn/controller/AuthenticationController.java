package com.cognizant.create_authentication_service_that_returns_jwt.controller;

import com.cognizant.create_authentication_service_that_returns_jwt.model.AuthenticationResponse;
import com.cognizant.create_authentication_service_that_returns_jwt.security.JwtUtil;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization") String authorizationHeader) {

        String base64Credentials =
                authorizationHeader.substring("Basic".length()).trim();

        byte[] decoded =
                Base64.getDecoder().decode(base64Credentials);

        String credentials =
                new String(decoded, StandardCharsets.UTF_8);

        String[] values = credentials.split(":", 2);

        String username = values[0];
        String password = values[1];

        if ("user".equals(username) && "pwd".equals(password)) {

            String token = JwtUtil.generateToken(username);

            return new AuthenticationResponse(token);
        }

        throw new RuntimeException("Invalid Username or Password");
    }
}