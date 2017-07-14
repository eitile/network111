package com.network111.service;

import com.network111.dto.UserDto;
import com.network111.entity.User;
import com.network111.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDto userExists(UserDto userDto) {
        User user = userRepository.getUserByCredentials(userDto.getLogin(), String.valueOf(userDto.getPassword().hashCode()));
        if (Objects.isNull(user)) {
            return null;
        } else {
            userDto.setPhoto(user.getPhoto());
            return userDto;
        }
    }
}
