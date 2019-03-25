package com.recruitment.application.user.mapper;

import com.recruitment.application.user.domain.UserAddress;
import com.recruitment.application.user.domain.UserAddressDto;

public class UserAddressMapper {

    public static UserAddress mapAddressDtoToAddress(UserAddressDto userAddress) {
        return new UserAddress(
                userAddress.getCity(),
                userAddress.getPostalCode(),
                userAddress.getCountry(),
                userAddress.getStreet()
        );
    }
}
