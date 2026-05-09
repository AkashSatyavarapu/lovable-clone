package com.akash.lovableClone.mapper;

import com.akash.lovableClone.dto.project.ProjectResponse;
import com.akash.lovableClone.entity.Project;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectMapper
{
    ProjectResponse convertToProjectResponse(Project project);
}
