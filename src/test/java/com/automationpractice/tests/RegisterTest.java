package com.automationpractice.tests;

import com.automationpractice.BaseTest;
import com.automationpractice.utils.User;
import org.junit.Test;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;


public class RegisterTest extends BaseTest {

    @Test
    public void registerTest() throws ParseException {
        User randomUser = new User();
        landingPage.clickButtonSignIn();
        loginPage.fillEmailRegister(randomUser.getEmail());
        loginPage.clickOnCreateAccountButtonRegister();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        registerPage.fillRegistrationForm(randomUser);
        registerPage.clickButtonRegister();
        myAccountPage.clickOnLogoutButton();
    }
}
