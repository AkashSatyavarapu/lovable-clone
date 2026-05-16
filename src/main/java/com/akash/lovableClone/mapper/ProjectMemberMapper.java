package com.akash.lovableClone.mapper;

import com.akash.lovableClone.dto.member.MemberResponse;
import com.akash.lovableClone.entity.ProjectMember;
import com.akash.lovableClone.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProjectMemberMapper
{
    @Mapping(target = "id", source = "user.id")
    @Mapping(target = "projectRole", constant = "OWNER")
    MemberResponse convertToMemberResponseFromUser(User user);

    @Mapping(target = "id", source = "user.id")
    @Mapping(target = "name", source = "user.name")
    @Mapping(target = "email", source = "user.email")
    @Mapping(target = "projectRole", source = "projectRole")
    MemberResponse convertToMemberResponseFromProjectMember(ProjectMember projectMember);
}
