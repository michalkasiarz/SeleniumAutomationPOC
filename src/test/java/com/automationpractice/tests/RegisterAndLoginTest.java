package com.automationpractice.tests;

import com.automationpractice.BaseTest;
import com.automationpractice.utils.User;
import org.junit.Test;

import java.text.ParseException;

public class RegisterAndLoginTest extends BaseTest {

    @Test
    public void RegisterAndloginTest() throws ParseException {
        User randomUser = new User();
        landingPage.clickButtonSignIn();
        loginPage.fillEmailRegister(randomUser.getEmail());
        loginPage.clickOnCreateAccountButtonRegister();
        registerPage.fillRegistrationForm(randomUser);
        registerPage.clickButtonRegister();
        myAccountPage.clickOnLogoutButton();
        loginPage.clickOnSignInButtonLogin();
        loginPage.fillEmailLogin(randomUser.getEmail());
        loginPage.fillPasswordLogin(randomUser.getPassword());
        loginPage.clickOnSignInButtonLogin();
        myAccountPage.clickOnLogoutButton();
    }

}
