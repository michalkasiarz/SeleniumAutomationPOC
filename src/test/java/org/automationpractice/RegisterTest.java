package org.automationpractice;

import org.automationpractice.pages.RegisterPage;
import org.automationpractice.utils.User;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;

public class RegisterTest extends BaseTest {

    protected RegisterPage registerPage;

    @Before
    public void open() {
        RegisterPage registerPage = new RegisterPage(driver);
        driver.get("google.com");
    }

    @Test
    public void registerTest() throws ParseException {
        User randomUser = new User();
        registerPage.register(randomUser);
    }

}
