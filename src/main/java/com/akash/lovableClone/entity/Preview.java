package com.akash.lovableClone.entity;

import com.akash.lovableClone.enums.PreviewStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
//@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Preview
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Project project;
    String nameSpace;
    String podName;
    String previewUrl;
    PreviewStatus status;
    Instant startedAt;
    Instant terminatedAt;

}
