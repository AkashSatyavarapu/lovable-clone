package com.akash.lovableClone.service;

import com.akash.lovableClone.dto.auth.AuthResponse;
import com.akash.lovableClone.dto.auth.LoginRequest;
import com.akash.lovableClone.dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService
{
    AuthResponse signup(SignupRequest signupRequest);

    AuthResponse  login(LoginRequest loginRequest);
}
