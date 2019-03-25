package com.recruitment.application.user.domain;

import javax.validation.constraints.*;
import java.util.Set;

public class UserDto {
    private final static String USER_FIRSTNAME_NOT_BLANK = "Imię nie może być puste";
    private final static String USER_LASTNAME_NOT_BLANK = "Nazwisko nie może być puste";
    private final static String USER_PESEL_NOT_VALID_SIZE =  "Pesel musi składać się dokładnie z 11 cyfr";
    private final static String USER_ADDRESS_NOT_NULL = "Adres nowego pracownika nie może być pusty";

    @NotBlank(message = USER_FIRSTNAME_NOT_BLANK)
    private String firstName;
    @NotBlank(message = USER_LASTNAME_NOT_BLANK)
    private String lastName;
    @Size(max = 11, min = 11, message = USER_PESEL_NOT_VALID_SIZE)
    private String pesel;
    @Email
    private String email;
    private Integer phoneNumber;
    @NotNull(message = USER_ADDRESS_NOT_NULL)
    private Set<UserAddressDto> userAddresses;

    public UserDto(String firstName, String lastName, String pesel, String email, Integer phoneNumber, Set<UserAddressDto> userAddresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userAddresses = userAddresses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<UserAddressDto> getUserAddresses() {
        return userAddresses;
    }

    public void setUserAddresses(Set<UserAddressDto> userAddresses) {
        this.userAddresses = userAddresses;
    }
}
