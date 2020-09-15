package com.automationpractice.tests;

import com.automationpractice.BaseTest;
import com.automationpractice.utils.User;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;

public class SearchAndBuyItemTest extends BaseTest {

    @Test
    public void searchAndBuyItem() throws ParseException {
        User randomUser = new User();
        landingPage.clickButtonSignIn();
        loginPage.preregister(randomUser.getEmail());
        registerPage.fillRegistrationFormAndRegister(randomUser);
        landingPage.searchForItem("dress");
        searchPage.addProductToCartAndProceedCheckout();
        shoppingCartPage.confirmOrder();
        assertEquals("Your order on My Store is complete.", shoppingCartPage.getOrderConfirmationInfo());
    }
}
