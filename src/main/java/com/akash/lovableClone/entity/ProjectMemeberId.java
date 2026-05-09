package com.akash.lovableClone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
//@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectMemeberId
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long projectId;
    Long userId;
}
