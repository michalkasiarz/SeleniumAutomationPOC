package org.automationpractice;

import org.automationpractice.utils.User;
import org.junit.Test;

import java.text.ParseException;


public class RegisterTest extends BaseTest {

    @Test
    public void registerTest() throws ParseException {
        User randomUser = new User();
        landingPage.clickButtonSignIn();
        loginPage.fillEmailRegister(randomUser.getEmail());
        loginPage.clickOnCreateAccountButtonRegister();
        registerPage.register(randomUser);
    }
}
