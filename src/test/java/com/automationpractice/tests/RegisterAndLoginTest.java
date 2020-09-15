package com.automationpractice.tests;

import com.automationpractice.BaseTest;
import com.automationpractice.utils.User;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;

public class RegisterAndLoginTest extends BaseTest {

    @Test
    public void registerAndLoginTest() throws ParseException {
        User randomUser = new User();
        landingPage.clickButtonSignIn();
        loginPage.preregister(randomUser.getEmail());
        registerPage.fillRegistrationFormAndRegister(randomUser);
        myAccountPage.clickOnLogoutButton();
        loginPage.login(randomUser.getEmail(), randomUser.getPassword());
        assertEquals(myAccountPage.getOwnerName(), randomUser.getFullName());
        myAccountPage.clickOnLogoutButton();
    }
}
