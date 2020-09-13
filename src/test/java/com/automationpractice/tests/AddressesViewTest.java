package com.automationpractice.tests;

import com.automationpractice.BaseTest;
import com.automationpractice.utils.User;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;
import java.text.ParseException;

import static org.junit.Assert.assertEquals;

public class AddressesViewTest extends BaseTest {

    @Test
    public void addressesViewTest() throws ParseException, NoSuchAlgorithmException {
        User randomUser = new User();
        landingPage.clickButtonSignIn();
        loginPage.fillEmailRegister(randomUser.getEmail());
        loginPage.clickOnCreateAccountButtonRegister();
        waitForLoad(driver);
        registerPage.fillRegistrationForm(randomUser);
        registerPage.clickButtonRegister();
        myAccountPage.clickOnButtonMyAddresses();
        System.out.println(myAddresses.getAddressAlias().getText());
        assertEquals(myAddresses.getAddressAlias().getText(), randomUser.getAlias());
    }
}