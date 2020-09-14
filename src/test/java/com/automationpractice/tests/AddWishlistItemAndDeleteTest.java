package com.automationpractice.tests;

import com.automationpractice.BaseTest;
import com.automationpractice.utils.User;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;

import java.text.ParseException;

import static org.junit.Assert.assertTrue;

public class AddWishlistItemAndDeleteTest extends BaseTest {

    @Test
    public void addItemToWishListAndDeleteIt() throws ParseException, NoSuchElementException {
        User randomUser = new User();
        landingPage.clickButtonSignIn();
        loginPage.preregister(randomUser.getEmail());
        registerPage.fillRegistrationFormAndRegister(randomUser);
        myAccountPage.clickOnLogoutButton();
        myAccountPage.clickOnButtonMyWishlists();
        myWishlistsPage.enterItemName("shoes");
        myWishlistsPage.clickOnSaveItemButton();
        myWishlistsPage.enterItemName("jacket");
        myWishlistsPage.clickOnSaveItemButton();
        myWishlistsPage.enterItemName("trousers");
        myWishlistsPage.clickOnSaveItemButton();
        myWishlistsPage.deleteItemFromWishlist("shoes");
        assertTrue(myWishlistsPage.checkIfItemExists("trousers"));
        assertTrue(myWishlistsPage.checkIfItemExists("jacket"));
    }
}
