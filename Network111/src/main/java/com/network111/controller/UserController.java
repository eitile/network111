package com.network111.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.network111.dto.UserDto;
import com.network111.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;

@Controller
public class UserController {

    private ObjectMapper mapper = new ObjectMapper();

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String userExists(@RequestBody String userString) throws IOException {
        UserDto userDto = mapper.readValue(userString, UserDto.class);
        return mapper.writeValueAsString(userService.userExists(userDto));
    }
}
