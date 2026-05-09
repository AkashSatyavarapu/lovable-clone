package com.akash.lovableClone.service;

import com.akash.lovableClone.dto.member.InviteMemberRequest;
import com.akash.lovableClone.dto.member.MemberResponse;
import com.akash.lovableClone.dto.member.UpdateMemberRoleRequest;

import java.util.List;

public interface ProjectMemberService
{
    List<MemberResponse> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest inviteMemberRequest, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long userId, UpdateMemberRoleRequest updateMemberRoleRequest, Long memberId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}
