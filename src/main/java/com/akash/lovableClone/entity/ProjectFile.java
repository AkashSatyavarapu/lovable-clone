package com.akash.lovableClone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
//@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectFile
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Project project;
    String path;
    String minioObjectKey;

    @CreationTimestamp
    Instant createdAt;

    @UpdateTimestamp
    Instant updatedAt;
    User createdBy;
    User updatedBy;
}
