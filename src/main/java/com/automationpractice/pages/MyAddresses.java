package com.automationpractice.pages;

import com.automationpractice.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAddresses extends BasePage {

    @FindBy(css = "p.alert.alert-warning")
    private WebElement pAlertNoAddress;

    @FindBy(css = "h3.page-subheading")
    private WebElement addressAlias;

    public MyAddresses(WebDriver driver) {
        super(driver);
    }

    public WebElement getAlertNoAddress() {
        return pAlertNoAddress;
    }

    public String getAddressAlias() {
        return addressAlias.getText();
    }
}
