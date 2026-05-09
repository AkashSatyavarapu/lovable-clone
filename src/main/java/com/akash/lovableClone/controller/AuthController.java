package com.akash.lovableClone.controller;

import com.akash.lovableClone.dto.auth.AuthResponse;
import com.akash.lovableClone.dto.auth.LoginRequest;
import com.akash.lovableClone.dto.auth.SignupRequest;
import com.akash.lovableClone.dto.auth.UserProfileResponse;
import com.akash.lovableClone.service.AuthService;
import com.akash.lovableClone.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController
{
    private final AuthService authService;
    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(@RequestBody SignupRequest signupRequest)
    {
        return ResponseEntity.ok(authService.signup(signupRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest loginRequest)
    {
        return ResponseEntity.ok(authService.login(loginRequest));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile()
    {
        Long userId = 1L;
        return ResponseEntity.ok(userService.getProfile(userId));
    }
}
