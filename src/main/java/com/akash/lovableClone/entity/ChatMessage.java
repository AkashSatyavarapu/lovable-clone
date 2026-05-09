package com.akash.lovableClone.entity;
import com.akash.lovableClone.enums.MessageRole;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
//@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    ChatSession chatSession;
    String content;
    String toolCalls;
    Integer tokensUsed;
    MessageRole role;

    @CreationTimestamp
    Instant createdAt;
}
