package com.automationpractice.tests;

import com.automationpractice.BaseTest;
import com.automationpractice.utils.User;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;

import java.security.NoSuchAlgorithmException;
import java.text.ParseException;

import static org.junit.Assert.assertTrue;

public class AddWishlistItemAndDeleteTest extends BaseTest {

    @Test
    public void addItemToWishListAndDeleteIt() throws ParseException, NoSuchAlgorithmException, NoSuchElementException {
        User randomUser = new User();
        landingPage.clickButtonSignIn();
        waitForLoad(driver);
        loginPage.fillEmailRegister(randomUser.getEmail());
        loginPage.clickOnCreateAccountButtonRegister();
        waitForLoad(driver);
        registerPage.fillRegistrationForm(randomUser);
        registerPage.clickButtonRegister();
        myAccountPage.clickOnButtonMyWishlists();
        waitForLoad(driver);
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
