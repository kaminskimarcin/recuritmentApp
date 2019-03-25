package com.recruitment.application.user.controller;

import com.recruitment.application.user.domain.UserAddressDto;
import com.recruitment.application.user.exception.UserNotFoundException;
import com.recruitment.application.user.facade.UserAddressFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/application")
public class UserAddressController {

    private final UserAddressFacade userAddressFacade;

    @Autowired
    public UserAddressController(UserAddressFacade userAddressFacade) {
        this.userAddressFacade = userAddressFacade;
    }

    @PostMapping(value = "address/{userId}")
    private void addAddressToExistingUser(@RequestBody UserAddressDto userAddressDto, @PathVariable Long userId) throws UserNotFoundException {
        userAddressFacade.addAddressToExistingUser(userAddressDto, userId);
    }

}
