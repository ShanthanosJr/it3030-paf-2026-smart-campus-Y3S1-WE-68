package com.kavishka.smart_campus_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class AppUser {
    @Id
    private String id; // email
    private String email;
    private String name; // name of the user
    private String phone; // phone number of the user
    private String department; // department of the user
    private String building; // building of the user
    private String googleSub; // google sub of the user
    private String role = "USER"; // USER, ADMIN, TECHNICIAN Roles
    private String profileImage; // URL/path to profile image
}