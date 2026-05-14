package com.akash.lovableClone.service.impl;

import com.akash.lovableClone.dto.project.ProjectRequest;
import com.akash.lovableClone.dto.project.ProjectResponse;
import com.akash.lovableClone.dto.project.ProjectSummaryResponse;
import com.akash.lovableClone.entity.Project;
import com.akash.lovableClone.entity.User;
import com.akash.lovableClone.mapper.ProjectMapper;
import com.akash.lovableClone.repository.ProjectRepository;
import com.akash.lovableClone.repository.UserRepository;
import com.akash.lovableClone.service.ProjectService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Transactional
public class ProjectServiceImpl implements ProjectService
{
    ProjectRepository projectRepository;
    UserRepository userRepository;
    ProjectMapper projectMapper;
    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId)
    {
        return projectMapper.convertToListOfProjectSummaryResponse(
                projectRepository.getAllAccessibleProjectsByUser(userId));
    }

    @Override
    public ProjectResponse getUserProjectById(Long userId, Long projectId)
    {
        Project project = getAccessibleProjectById(projectId, userId);
        return projectMapper.convertToProjectResponse(project);
    }

    @Override
    public ProjectResponse createProject(ProjectRequest projectRequest, Long userId)
    {
        User objUser = userRepository.findById(userId).orElseThrow();
        Project project = Project.builder()
                .name(projectRequest.name())
                .owner(objUser)
                .isPublic(false)
                .build();
        project = projectRepository.save(project);
        return projectMapper.convertToProjectResponse(project);
    }

    @Override
    public ProjectResponse updateProject(Long projectId, ProjectRequest projectRequest, Long userId)
    {
        Project project = getAccessibleProjectById(projectId, userId);
        if(!project.getOwner().getId().equals(userId))
            throw new RuntimeException("You are not allowed to update the project!!!");
        project.setName(projectRequest.name());
        project = projectRepository.save(project);
        return projectMapper.convertToProjectResponse(project);
    }

    @Override
    public void softDelete(Long projectId, Long userId)
    {
        Project project = getAccessibleProjectById(projectId, userId);
        if(!project.getOwner().getId().equals(userId))
            throw new RuntimeException("You are not allowed to delete the project!!!");
        project.setDeletedAt(Instant.now());
        projectRepository.save(project);
    }

    private Project getAccessibleProjectById(Long projectId, Long userId)
    {
        return projectRepository.getAccessibleProjectById(projectId, userId).orElseThrow();
    }
}
