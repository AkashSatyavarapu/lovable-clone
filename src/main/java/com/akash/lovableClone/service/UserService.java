package com.akash.lovableClone.service;

import com.akash.lovableClone.dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface UserService
{
    UserProfileResponse getProfile(Long userId);
}
