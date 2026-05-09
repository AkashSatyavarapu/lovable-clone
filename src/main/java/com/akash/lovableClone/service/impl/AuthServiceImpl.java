package com.akash.lovableClone.service.impl;

import com.akash.lovableClone.dto.auth.AuthResponse;
import com.akash.lovableClone.dto.auth.LoginRequest;
import com.akash.lovableClone.dto.auth.SignupRequest;
import com.akash.lovableClone.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService
{
    @Override
    public AuthResponse signup(SignupRequest signupRequest) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest loginRequest) {
        return null;
    }
}
