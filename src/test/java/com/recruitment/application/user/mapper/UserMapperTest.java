package com.recruitment.application.user.mapper;

import com.recruitment.application.user.domain.User;
import com.recruitment.application.user.domain.UserAddressDto;
import com.recruitment.application.user.domain.UserDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Test
    public void test_map_userdto_to_user() {
        //Given
        UserAddressDto userAddress = new UserAddressDto(
                "test",
                "test",
                "test",
                "test"
        );

        Set<UserAddressDto> userAddressSet = new HashSet<>();
        userAddressSet.add(userAddress);

        UserDto userDto = new UserDto(
                "test",
                "test",
                "12345678901",
                "test@wp.pl",
                12345,
                userAddressSet
        );

        //When
        User user = UserMapper.mapUserDtoToUser(userDto);

        //Then
        assertEquals(user.getEmail(), userDto.getEmail());
        assertEquals(user.getFirstName(), userDto.getFirstName());
        assertEquals(user.getLastName(), userDto.getLastName());
        assertEquals(user.getPesel(), userDto.getPesel());
        assertEquals(user.getPhoneNumber(), userDto.getPhoneNumber());
        assertEquals(user.getUserAddresses().size(), userDto.getUserAddresses().size());
    }

}