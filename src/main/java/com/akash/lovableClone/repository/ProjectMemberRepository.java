package com.akash.lovableClone.repository;

import com.akash.lovableClone.entity.ProjectMember;
import com.akash.lovableClone.entity.ProjectMemeberId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectMemberRepository extends JpaRepository<ProjectMember, ProjectMemeberId>
{

}
