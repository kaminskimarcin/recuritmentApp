package com.recruitment.application.user.mapper;

import com.recruitment.application.user.domain.User;
import com.recruitment.application.user.domain.UserDto;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

public class UserMapper {

    public static User mapUserDtoToUser(UserDto userDto) {
        return new User(
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getPesel(),
                userDto.getEmail(),
                userDto.getPhoneNumber(),
                userDto.getUserAddresses().stream()
                        .map(UserAddressMapper::mapAddressDtoToAddress)
                        .collect(Collectors.toSet())
        );

    }
}
