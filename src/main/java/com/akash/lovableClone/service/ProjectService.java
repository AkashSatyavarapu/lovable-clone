package com.akash.lovableClone.service;

import com.akash.lovableClone.dto.project.ProjectRequest;
import com.akash.lovableClone.dto.project.ProjectResponse;
import com.akash.lovableClone.dto.project.ProjectSummaryResponse;

import java.util.List;

public interface ProjectService
{
    List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getUserProjectById(Long userId, Long projectId);

    ProjectResponse createProject(ProjectRequest projectRequest, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest projectRequest, Long userId);

    void softDelete(Long id, Long userId);
}
