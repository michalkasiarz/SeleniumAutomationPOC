package com.automationpractice.utils;

import com.github.javafaker.Faker;

import java.text.ParseException;
import java.util.Locale;
import java.util.Random;

public class User {

    private final String title;
    private final String firstNamePersonalInfo;
    private final String lastNamePersonalInfo;
    private final String email;
    private final String password;
    private final String dateOfBirthDay;
    private final String dateOfBirthMonth;
    private final String dateOfBirthYear;
    private final String addressAddress;
    private final String cityAddress;
    private final String stateAddress;
    private final String postalCodeAddress;
    private final String countryAddress;
    private final String mobilePhone;

    public User() throws ParseException {
        Faker faker = new Faker(new Locale("en-US"));
        title = new Random().nextBoolean() ? "Mr." : "Mrs.";
        firstNamePersonalInfo = faker.name().firstName();
        lastNamePersonalInfo = faker.name().lastName();
        email = faker.internet().emailAddress();
        password = faker.internet().password();

        FakeDate birthdayDate = new FakeDate();
        dateOfBirthDay = birthdayDate.getDayOfBirth();
        dateOfBirthMonth = birthdayDate.getMonthOfBirth();
        dateOfBirthYear = birthdayDate.getYearOfBirth();

        addressAddress = faker.address().fullAddress();
        cityAddress = faker.address().city();
        stateAddress = faker.address().state();

        postalCodeAddress = String.valueOf(new Random().nextInt(90000) + 10000);
        countryAddress = "United States";
        mobilePhone = faker.phoneNumber().cellPhone();
    }

    public String getTitle() {
        return title;
    }

    public String getFirstNamePersonalInfo() {
        return firstNamePersonalInfo;
    }

    public String getLastNamePersonalInfo() {
        return lastNamePersonalInfo;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getDateOfBirthDay() {
        return dateOfBirthDay;
    }

    public String getDateOfBirthMonth() {
        return dateOfBirthMonth;
    }

    public String getDateOfBirthYear() {
        return dateOfBirthYear;
    }

    public String getAddressAddress() {
        return addressAddress;
    }

    public String getCityAddress() {
        return cityAddress;
    }

    public String getStateAddress() {
        return stateAddress;
    }

    public String getCountryAddress() {
        return countryAddress;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getPostalCodeAddress() { return postalCodeAddress; }

    public String getFullName() {
        return firstNamePersonalInfo + " " + lastNamePersonalInfo;
    }
}
