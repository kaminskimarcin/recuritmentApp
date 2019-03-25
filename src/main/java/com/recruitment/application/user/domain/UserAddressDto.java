package com.recruitment.application.user.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class UserAddressDto {
    private final static String USER_ADDRESS_CITY_NOT_BLANK = "Miasto nie może być puste";
    private final static String USER_ADDRESS_POSTAL_CODE_NOT_VALID_FORMAT = "Kod pocztowy niezgodny z formatem XX-XXX";
    private final static String USER_ADDRESS_POSTAL_CODE_NOT_BLANK = "Kod pocztowy nie może być pusty";
    private final static String USER_ADDRESS_COUNTRY_NOT_BLANK = "Pole kraj nie może być puste";
    private final static String USER_ADDRESS_STREET_NOT_BLANK = "Pole ulica nie może być puste";

    @NotBlank(message = USER_ADDRESS_CITY_NOT_BLANK)
    private String city;
    @NotBlank(message = USER_ADDRESS_POSTAL_CODE_NOT_BLANK)
    @Pattern(regexp = "\\d{2}-\\d{3}",message = USER_ADDRESS_POSTAL_CODE_NOT_VALID_FORMAT)
    private String postalCode;
    @NotBlank(message = USER_ADDRESS_COUNTRY_NOT_BLANK)
    private String country;
    @NotBlank(message = USER_ADDRESS_STREET_NOT_BLANK)
    private String street;

    public UserAddressDto(String city, String postalCode, String country, String street) {
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}

