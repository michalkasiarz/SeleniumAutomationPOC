package com.automationpractice.tests;

import com.automationpractice.BaseTest;
import com.automationpractice.utils.User;
import org.junit.Test;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
        assertTrue(myAccountPage.getButtonWithAccountOwnerName().isDisplayed());
        myAccountPage.clickOnLogoutButton();
        assertFalse(myAccountPage.getButtonWithAccountOwnerName().isDisplayed());
    }
}
