package com.example.baitapspring.service;

import com.example.baitapspring.dto.JwtAuthenticationResponse;
import com.example.baitapspring.dto.RefreshTokenRequest;
import com.example.baitapspring.dto.SignUpRequest;
import com.example.baitapspring.dto.SigninRequest;
import com.example.baitapspring.entity.User;

public interface AuthenticationService {
    User signup(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signin(SigninRequest signinRequest);
    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
