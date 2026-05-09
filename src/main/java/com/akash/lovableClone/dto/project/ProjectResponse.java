package com.akash.lovableClone.dto.project;

import com.akash.lovableClone.dto.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(Long id, String name, Instant createdAt, Instant updatedAt, UserProfileResponse owner)
{

}
