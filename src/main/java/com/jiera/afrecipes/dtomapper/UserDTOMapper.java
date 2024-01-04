package com.jiera.afrecipes.dtomapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.jiera.afrecipes.domain.User;
import com.jiera.afrecipes.dto.UserDTO;

@Component
public class UserDTOMapper {
    public static UserDTO fromUser(User user) {
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        return userDTO;
    };

    public static User toUser(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        return user;
    };
}
