package com.automationpractice.pages;

import com.automationpractice.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    @FindBy(css = "a.login")
    private WebElement buttonSignIn;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void clickButtonSignIn() {
        buttonSignIn.click();
    }
}
