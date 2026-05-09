package com.akash.lovableClone.service.impl;

import com.akash.lovableClone.dto.auth.UserProfileResponse;
import com.akash.lovableClone.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{

    @Override
    public UserProfileResponse getProfile(Long userId) {
        return null;
    }
}
