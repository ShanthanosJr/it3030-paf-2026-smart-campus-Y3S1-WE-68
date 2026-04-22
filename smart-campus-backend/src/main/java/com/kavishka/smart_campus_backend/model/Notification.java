package com.kavishka.smart_campus_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "notifications")
public class Notification {
    @Id
    private String id;
    private String userId; // user who receives the notification
    private String message; // message of the notification
    private boolean isRead = false; // whether the notification has been read
    private LocalDateTime timestamp = LocalDateTime.now(); // timestamp of the notification
    private String relatedId; // related id of the notification
}