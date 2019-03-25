package com.recruitment.application.user.facade;

import com.recruitment.application.user.domain.UserAddressDto;
import com.recruitment.application.user.exception.UserNotFoundException;
import com.recruitment.application.user.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserAddressFacade {

    private final UserAddressService userAddressService;

    @Autowired
    public UserAddressFacade(UserAddressService userAddressService) {
        this.userAddressService = userAddressService;
    }

    public void addAddressToExistingUser(UserAddressDto userAddressDto, Long userId) throws UserNotFoundException {
        userAddressService.addAddressToExistingUser(userAddressDto, userId);
    }
}
