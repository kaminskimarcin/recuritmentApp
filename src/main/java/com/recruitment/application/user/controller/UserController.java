package com.recruitment.application.user.controller;

import com.recruitment.application.user.domain.User;
import com.recruitment.application.user.domain.UserDto;
import com.recruitment.application.user.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/application")
public class UserController {

    private final UserFacade userFacade;

    @Autowired
    public UserController(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    @GetMapping(value = "/users")
    private List<User> getUsers() {
        return userFacade.getUsers();
    }

    @PostMapping(value = "/user")
    private void addUser(@Valid @RequestBody UserDto userDto) {
        userFacade.saveUser(userDto);
    }


}
