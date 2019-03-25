package com.recruitment.application.user.facade;

import com.recruitment.application.user.domain.User;
import com.recruitment.application.user.domain.UserDto;
import com.recruitment.application.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserFacade {

    private final UserService userService;

    @Autowired
    public UserFacade(UserService userService) {
        this.userService = userService;
    }

    public List<User> getUsers() {
        return userService.getUsers();
    }

    public void saveUser(UserDto userDto) {
        userService.saveUser(userDto);
    }
}
