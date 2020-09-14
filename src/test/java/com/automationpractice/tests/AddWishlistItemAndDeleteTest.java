package com.automationpractice.tests;

import com.automationpractice.BaseTest;
import com.automationpractice.utils.User;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;

import java.text.ParseException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AddWishlistItemAndDeleteTest extends BaseTest {

    @Test
    public void addItemToWishListAndDeleteIt() throws ParseException, NoSuchElementException {
        User randomUser = new User();
        landingPage.clickButtonSignIn();
        loginPage.preregister(randomUser.getEmail());
        registerPage.fillRegistrationFormAndRegister(randomUser);
        myAccountPage.clickOnButtonMyWishlists();
        myWishlistsPage.addItemToWishlist("shoes");
        myWishlistsPage.addItemToWishlist("jacket");
        myWishlistsPage.addItemToWishlist("trousers");
        myWishlistsPage.deleteItemFromWishlist("shoes");
        assertTrue(myWishlistsPage.checkIfItemExists("trousers"));
        assertTrue(myWishlistsPage.checkIfItemExists("jacket"));
        assertFalse(myWishlistsPage.checkIfItemNotExist("shoes"));
    }
}
