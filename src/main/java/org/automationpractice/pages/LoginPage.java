package org.automationpractice.pages;

import org.automationpractice.BasePage;
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

    public void fillEmailLogin(String email) {
        inputEmailLogin.sendKeys(email);
    }

    public void fillPasswordLogin(String password) {
        inputPasswordLogin.sendKeys(password);
    }

    public void clickOnSignInButtonLogin() {
        buttonSignInLogin.click();
    }

    public void fillEmailRegister(String email) {
        inputEmailRegister.sendKeys(email);
    }

    public void clickOnCreateAccountButtonRegister() {
        buttonCreateAccount.click();
    }
}
