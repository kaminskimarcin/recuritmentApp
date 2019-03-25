package com.recruitment.application.user.service;

import com.recruitment.application.user.domain.User;
import com.recruitment.application.user.domain.UserAddress;
import com.recruitment.application.user.domain.UserAddressDto;
import com.recruitment.application.user.exception.UserNotFoundException;
import com.recruitment.application.user.mapper.UserAddressMapper;
import com.recruitment.application.user.repository.UserAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class UserAddressService {

    private final UserAddressRepository userAddressRepository;
    private final UserService userService;

    @Autowired
    public UserAddressService(UserAddressRepository userAddressRepository, UserService userService) {
        this.userAddressRepository = userAddressRepository;
        this.userService = userService;
    }

    public void addAddressToExistingUser(UserAddressDto userAddressDto, Long userId) throws UserNotFoundException {
        userAddressRepository.save(prepareUserAddressToSave(userAddressDto, userId));
    }

    private UserAddress prepareUserAddressToSave(UserAddressDto userAddressDto, Long id) throws UserNotFoundException {
        User user = getUserById(id);
        if (ObjectUtils.isEmpty(user)) {
            throw new UserNotFoundException();
        }
        UserAddress userAddress = UserAddressMapper.mapAddressDtoToAddress(userAddressDto);
        userAddress.setUser(user);
        return userAddress;
    }

    private User getUserById(Long id) {
        return userService.findUser(id).orElse(null);
    }
}
