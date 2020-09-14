package com.automationpractice.pages;

import com.automationpractice.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = "#email")
    private WebElement inputEmailLogin;

    @FindBy(css = "#passwd")
    private WebElement inputPasswordLogin;

    @FindBy(css = "#SubmitLogin")
    private WebElement buttonSignInLogin;

    @FindBy(css = "#email_create")
    private WebElement inputEmailRegister;

    @FindBy(css = "#SubmitCreate")
    private WebElement buttonCreateAccount;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        inputEmailLogin.sendKeys(email);
        inputPasswordLogin.sendKeys(password);
        buttonSignInLogin.click();
    }

    public void preregister(String email) {
        inputEmailRegister.sendKeys(email);
        buttonCreateAccount.click();
    }
}
