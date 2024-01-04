package com.jiera.afrecipes.service.implementation;

import org.springframework.stereotype.Service;

import com.jiera.afrecipes.domain.User;
import com.jiera.afrecipes.dto.UserDTO;
import com.jiera.afrecipes.dtomapper.UserDTOMapper;
import com.jiera.afrecipes.repository.UserRepository;
import com.jiera.afrecipes.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository<User> userRepository;

    @Override
    public UserDTO createUser(User user) {
        return UserDTOMapper.fromUser(userRepository.create(user));
    }

}
