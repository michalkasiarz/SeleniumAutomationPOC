package com.automationpractice.tests;

import com.automationpractice.BaseTest;
import com.automationpractice.utils.User;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;
import java.text.ParseException;

import static org.junit.Assert.assertEquals;

public class RegisterTest extends BaseTest {

    @Test
    public void registerTest() throws ParseException, NoSuchAlgorithmException {
        User randomUser = new User();
        landingPage.clickButtonSignIn();
        waitForLoad(driver);
        loginPage.fillEmailRegister(randomUser.getEmail());
        waitForLoad(driver);
        loginPage.clickOnCreateAccountButtonRegister();
        waitForLoad(driver);
        registerPage.fillRegistrationForm(randomUser);
        registerPage.clickButtonRegister();
        assertEquals(myAccountPage.getButtonWithAccountOwnerName().getText(), randomUser.getFirstNamePersonalInfo() + " " + randomUser.getLastNamePersonalInfo());
        myAccountPage.clickOnLogoutButton();
    }
}
