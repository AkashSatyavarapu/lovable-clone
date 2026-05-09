package com.akash.lovableClone.dto.member;

import com.akash.lovableClone.enums.ProjectRole;

public record InviteMemberRequest(String email, ProjectRole role) {
}
