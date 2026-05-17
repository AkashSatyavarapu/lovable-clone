package com.akash.lovableClone.service.impl;

import com.akash.lovableClone.dto.member.InviteMemberRequest;
import com.akash.lovableClone.dto.member.MemberResponse;
import com.akash.lovableClone.dto.member.UpdateMemberRoleRequest;
import com.akash.lovableClone.entity.Project;
import com.akash.lovableClone.entity.ProjectMember;
import com.akash.lovableClone.entity.ProjectMemeberId;
import com.akash.lovableClone.entity.User;
import com.akash.lovableClone.mapper.ProjectMemberMapper;
import com.akash.lovableClone.repository.ProjectMemberRepository;
import com.akash.lovableClone.repository.ProjectRepository;
import com.akash.lovableClone.repository.UserRepository;
import com.akash.lovableClone.service.ProjectMemberService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Service
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class ProjectMemberServiceImpl implements ProjectMemberService {
    ProjectMemberRepository projectMemberRepository;
    ProjectRepository projectRepository;
    ProjectMemberMapper projectMemberMapper;
    UserRepository userRepository;

    @Override
    public List<MemberResponse> getProjectMembers(Long projectId, Long userId)
    {
        Project project = getAccessibleProjectById(projectId, userId);
        List<MemberResponse> lstMemeberResponse = new ArrayList<>();
        lstMemeberResponse.add(projectMemberMapper.convertToMemberResponseFromUser(project.getOwner()));
        List<ProjectMember> lstProjectMember = projectMemberRepository.findByIdProjectId(projectId);
        lstMemeberResponse.addAll(
                lstProjectMember
                        .stream()
                        .map(projectMemberMapper::convertToMemberResponseFromProjectMember)
                        .toList());
        return lstMemeberResponse;
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest inviteMemberRequest, Long userId)
    {
        Project project = projectRepository.getAccessibleProjectById(projectId, userId).orElseThrow();
        if (!project.getOwner().getId().equals(userId))
            throw new RuntimeException("You are not allowed to invite!!!");

        User invitee = userRepository.findByEmail(inviteMemberRequest.email()).orElseThrow();

        if (invitee.getId().equals(userId))
            throw new RuntimeException("Can't invite yourself!!!");

        ProjectMemeberId projectMemeberId = new ProjectMemeberId(projectId, invitee.getId());
        if (projectMemberRepository.existsById(projectMemeberId))
            throw new RuntimeException("Can't invite again!!!");

        ProjectMember projectMember = ProjectMember.builder()
                .id(projectMemeberId)
                .project(project)
                .user(invitee)
                .projectRole(inviteMemberRequest.role())
                .invitedAt(Instant.now())
                .build();
        projectMemberRepository.save(projectMember);

        return projectMemberMapper.convertToMemberResponseFromProjectMember(projectMember);
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long userId, UpdateMemberRoleRequest updateMemberRoleRequest, Long memberId)
    {
        Project project = projectRepository.getAccessibleProjectById(projectId, userId).orElseThrow();
        if (!project.getOwner().getId().equals(userId))
            throw new RuntimeException("You are not allowed to invite!!!");

        ProjectMemeberId projectMemeberId = new ProjectMemeberId(projectId, memberId);
        ProjectMember projectMember = projectMemberRepository.findById(projectMemeberId).orElseThrow();
        projectMember.setProjectRole(updateMemberRoleRequest.role());
        projectMemberRepository.save(projectMember);
        return projectMemberMapper.convertToMemberResponseFromProjectMember(projectMember);
    }

    @Override
    public MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId) {
        return null;
    }


    private Project getAccessibleProjectById(Long projectId, Long userId) {
        return projectRepository.getAccessibleProjectById(projectId, userId).orElseThrow();
    }
}
