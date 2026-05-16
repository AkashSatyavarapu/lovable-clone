package com.akash.lovableClone.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class ProjectMemeberId
{
    Long projectId;
    Long userId;
}
