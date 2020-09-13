package com.automationpractice.tests;

import com.automationpractice.BaseTest;
import com.automationpractice.utils.User;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.assertTrue;

public class RegisterAndLoginTest extends BaseTest {

    @Test
    public void RegisterAndloginTest() throws ParseException {
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
        assertTrue(myAccountPage.getButtonWithAccountOwnerName().getText().equals(randomUser.getFirstNamePersonalInfo() + " " + randomUser.getLastNamePersonalInfo()));
        myAccountPage.clickOnLogoutButton();
    }

}
