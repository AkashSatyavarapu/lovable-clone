package com.akash.lovableClone.entity;
import jakarta.persistence.Entity;
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
public class ChatSession
{
    Project project;
    User user;
    String title;

    @CreationTimestamp
    Instant createdAt;

    @UpdateTimestamp
    Instant updatedAt;
    Instant deletedAt;
}
