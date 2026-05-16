package com.akash.lovableClone.dto.member;

import com.akash.lovableClone.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(Long id, String email, String name, ProjectRole projectRole, Instant invitedAt)
{

}
