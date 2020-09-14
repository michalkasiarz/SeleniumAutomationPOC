package com.automationpractice.tests;

import com.automationpractice.BaseTest;
import com.automationpractice.utils.User;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.assertNotNull;

public class AddressesViewTest extends BaseTest {

    @Test
    public void addressesViewTest() throws ParseException {
        User randomUser = new User();
        landingPage.clickButtonSignIn();
        loginPage.preregister(randomUser.getEmail());
        registerPage.fillRegistrationFormAndRegister(randomUser);
        myAccountPage.clickOnLogoutButton();
        myAccountPage.clickOnButtonMyAddresses();
        assertNotNull(myAddresses.getAddressAlias());
    }
}
