package com.akash.lovableClone.service.impl;

import com.akash.lovableClone.dto.member.InviteMemberRequest;
import com.akash.lovableClone.dto.member.MemberResponse;
import com.akash.lovableClone.dto.member.UpdateMemberRoleRequest;
import com.akash.lovableClone.service.ProjectMemberService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectMemberServiceImpl implements ProjectMemberService
{

    @Override
    public List<MemberResponse> getProjectMembers(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest inviteMemberRequest, Long userId) {
        return null;
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long userId, UpdateMemberRoleRequest updateMemberRoleRequest, Long memberId) {
        return null;
    }

    @Override
    public MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId) {
        return null;
    }
}
