package com.automationpractice.tests;

import com.automationpractice.BaseTest;
import com.automationpractice.utils.User;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;

public class RegisterTest extends BaseTest {

    @Test
    public void registerTest() throws ParseException {
        User randomUser = new User();
        landingPage.clickButtonSignIn();
        loginPage.preregister(randomUser.getEmail());
        registerPage.fillRegistrationFormAndRegister(randomUser);
        assertEquals(myAccountPage.getOwnerName(), randomUser.getFullName());
       // myAccountPage.clickOnLogoutButton();
    }
}
