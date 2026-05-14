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
        Project project = projectRepository.getAccessibleProjectById(projectId, userId).orElseThrow();
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
    public ProjectResponse updateProject(Long id, ProjectRequest projectRequest, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}
