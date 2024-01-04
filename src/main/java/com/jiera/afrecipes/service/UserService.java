package com.jiera.afrecipes.service;

import com.jiera.afrecipes.domain.User;
import com.jiera.afrecipes.dto.UserDTO;

public interface UserService {
    UserDTO createUser(User user);
}
