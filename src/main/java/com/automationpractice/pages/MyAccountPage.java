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

    @FindBy(css = "a[title='Orders']")
    private WebElement buttonOrderHistoryAndDetails;

    @FindBy(css = "a[title='Credit slips']")
    private WebElement buttonMyCreditSlips;

    @FindBy(css = "a[title='Addresses']")
    private WebElement buttonMyAddresses;

    @FindBy(css = "a[title='Information']")
    private WebElement buttonMyPersonalInformation;

    @FindBy(css = "a[title='My wishlists']")
    private WebElement buttonMyWishlists;

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

    public void clickOnOrderHistoryAndDetailsButton() {
        buttonOrderHistoryAndDetails.click();
    }

    public void clickOnButtonMyCreditSlips() {
        buttonMyCreditSlips.click();
    }

    public void clickOnButtonMyAddresses() {
        buttonMyAddresses.click();
    }

    public void clickOnButtonMyPersonalInfo() {
        buttonMyPersonalInformation.click();
    }

    public void clickOnButtonMyWishlists() {
        buttonMyWishlists.click();
    }

    public WebElement getButtonWithAccountOwnerName() {
        return buttonWithAccountOwnerName;
    }

    public WebElement getButtonLogout() {
        return buttonLogout;
    }

    public WebElement getButtonShoppingCart() {
        return buttonShoppingCart;
    }

    public WebElement getButtonOrderHistoryAndDetails() {
        return buttonOrderHistoryAndDetails;
    }

    public WebElement getButtonMyCreditSlips() {
        return buttonMyCreditSlips;
    }

    public WebElement getButtonMyAddresses() {
        return buttonMyAddresses;
    }

    public WebElement getButtonMyPersonalInformation() {
        return buttonMyPersonalInformation;
    }

    public WebElement getButtonMyWishlists() {
        return buttonMyWishlists;
    }
}
