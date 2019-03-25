package com.recruitment.application.user.service;

import com.google.common.collect.Lists;
import com.recruitment.application.user.domain.User;
import com.recruitment.application.user.domain.UserDto;
import com.recruitment.application.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.recruitment.application.user.mapper.UserMapper.mapUserDtoToUser;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return Lists.newArrayList(userRepository.findAll());
    }

    public void saveUser(UserDto userDto) {
        userRepository.save(prepareUserObjectToSave(userDto));
    }

    Optional<User> findUser(Long id) {
        return userRepository.findById(id);
    }

    private User prepareUserObjectToSave(UserDto userDto) {
        User user = mapUserDtoToUser(userDto);
        user.getUserAddresses().forEach(userAddress -> userAddress.setUser(user));
        return user;
    }
}
