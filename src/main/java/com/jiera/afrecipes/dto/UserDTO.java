package com.jiera.afrecipes.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String address;
    private String postalCode;
    private String city;
    private String phone;
    private String title;
    private String bio;
    private String imageUrl;
    private Boolean enabled;
    private Boolean isNotLocked;
    private Boolean isUsingMfa;
    private LocalDateTime createdAt;
}
