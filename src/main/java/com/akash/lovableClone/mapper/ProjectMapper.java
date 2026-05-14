package com.akash.lovableClone.mapper;

import com.akash.lovableClone.dto.project.ProjectResponse;
import com.akash.lovableClone.dto.project.ProjectSummaryResponse;
import com.akash.lovableClone.entity.Project;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper
{
    ProjectResponse convertToProjectResponse(Project project);

    List<ProjectSummaryResponse> convertToListOfProjectSummaryResponse(List<Project> project);
}
