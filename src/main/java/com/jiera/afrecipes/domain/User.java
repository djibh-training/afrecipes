package com.jiera.afrecipes.domain;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class User {
    private Long id;
    @NotEmpty(message = "Vous devez renseigner un prénom")
    private String firstName;
    @NotEmpty(message = "Vous devez renseigner un nom")
    private String lastName;
    @NotEmpty(message = "Vous devez renseigner un nom d'utilisateur")
    private String username;
    @NotEmpty(message = "Vous devez renseigner une adresse email")
    @Email(message = "Adresse introuvable. Veuillez entrer une adresse valide")
    private String email;
    @NotEmpty(message = "Vous devez renseigner un mot de passe")
    private String password;
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
