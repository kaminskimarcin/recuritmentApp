package com.recruitment.application.user.mapper;

import com.recruitment.application.user.domain.UserAddress;
import com.recruitment.application.user.domain.UserAddressDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserAddressMapperTest {

    @Test
    public void test_map_addressdto_to_address() {
        //Given
        UserAddressDto userAddressDto = new UserAddressDto(
                "test",
                "test",
                "test",
                "test"
        );

        Set<UserAddressDto> userAddressSet = new HashSet<>();
        userAddressSet.add(userAddressDto);

        //when
        UserAddress userAddress = UserAddressMapper.mapAddressDtoToAddress(userAddressDto);

        //then
        assertEquals(userAddress.getCity(), userAddressDto.getCity());
        assertEquals(userAddress.getCountry(), userAddressDto.getCountry());
        assertEquals(userAddress.getPostalCode(), userAddressDto.getPostalCode());
        assertEquals(userAddress.getStreet(), userAddressDto.getStreet());
    }

}