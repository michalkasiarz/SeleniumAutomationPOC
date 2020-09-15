package com.automationpractice.pages;

import com.automationpractice.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    @FindBy(css = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")
    private WebElement buttonProceedToCheckout;

    @FindBy(css = "#center_column > form > p > button")
    private WebElement buttonConfirmAddress;

    @FindBy(css = "#form > p > button")
    private WebElement buttonConfirmShipping;

    @FindBy(css = "#cgv")
    private WebElement checkboxAgreeTerms;

    @FindBy(css = "a.bankwire")
    private WebElement aPayByBankwire;

    @FindBy(css = "#cart_navigation > button")
    private WebElement buttonConfirmOrder;

    @FindBy(css = "#center_column > div > p > strong")
    private WebElement orderConfirmationInfo;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public String getOrderConfirmationInfo() {
        return orderConfirmationInfo.getText();
    }

    public void confirmOrder() {
        buttonProceedToCheckout.click();
        buttonConfirmAddress.click();
        checkboxAgreeTerms.click();
        buttonConfirmShipping.click();
        aPayByBankwire.click();
        buttonConfirmOrder.click();
    }


}
