package com.automationpractice.pages;

import com.automationpractice.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    @FindBy(css = "a.account")
    private WebElement buttonWithAccountOwnerName;

    @FindBy(css = "a.logout")
    private WebElement buttonLogout;

    @FindBy(css = "div.shopping_cart")
    private WebElement buttonShoppingCart;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnLogoutButton() {
        buttonLogout.click();
    }

    public void clickOnShoppingCartButton() {
        buttonShoppingCart.click();
    }

    public void clickOnOwnerNamedButton() {
        buttonWithAccountOwnerName.click();
    }
}
