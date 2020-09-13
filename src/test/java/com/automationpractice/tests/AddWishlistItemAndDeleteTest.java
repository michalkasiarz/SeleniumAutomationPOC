package com.automationpractice.tests;

import com.automationpractice.BaseTest;
import com.automationpractice.utils.User;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class AddWishlistItemAndDeleteTest extends BaseTest {

    @Test
    public void addItemToWishListAndDeleteIt() throws ParseException, NoSuchAlgorithmException {
        User randomUser = new User();
        landingPage.clickButtonSignIn();
        loginPage.fillEmailRegister(randomUser.getEmail());
        loginPage.clickOnCreateAccountButtonRegister();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        registerPage.fillRegistrationForm(randomUser);
        registerPage.clickButtonRegister();
        myAccountPage.clickOnButtonMyWishlists();
        myWishlistsPage.enterItemName("shoes");
        myWishlistsPage.clickOnSaveItemButton();
        myWishlistsPage.enterItemName("jacket");
        myWishlistsPage.clickOnSaveItemButton();
        myWishlistsPage.enterItemName("trousers");
        myWishlistsPage.clickOnSaveItemButton();
        myWishlistsPage.deleteItemFromWishlist("shoes");
    }
}
