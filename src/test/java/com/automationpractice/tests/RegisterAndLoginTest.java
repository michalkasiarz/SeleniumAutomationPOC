package com.automationpractice.tests;

import com.automationpractice.BaseTest;
import com.automationpractice.utils.User;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;
import java.text.ParseException;

import static org.junit.Assert.assertEquals;

public class RegisterAndLoginTest extends BaseTest {

    @Test
    public void RegisterAndloginTest() throws ParseException, NoSuchAlgorithmException {
        User randomUser = new User();
        landingPage.clickButtonSignIn();
        loginPage.fillEmailRegister(randomUser.getEmail());
        loginPage.clickOnCreateAccountButtonRegister();
        registerPage.fillRegistrationForm(randomUser);
        registerPage.clickButtonRegister();
        waitForLoad(driver);
        myAccountPage.clickOnLogoutButton();
        loginPage.clickOnSignInButtonLogin();
        loginPage.fillEmailLogin(randomUser.getEmail());
        loginPage.fillPasswordLogin(randomUser.getPassword());
        loginPage.clickOnSignInButtonLogin();
        waitForLoad(driver);
        assertEquals(myAccountPage.getButtonWithAccountOwnerName().getText(), randomUser.getFirstNamePersonalInfo() + " " + randomUser.getLastNamePersonalInfo());
        myAccountPage.clickOnLogoutButton();
    }

}
