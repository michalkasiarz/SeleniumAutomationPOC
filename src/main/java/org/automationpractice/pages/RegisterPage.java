package org.automationpractice.pages;

import org.automationpractice.BasePage;
import org.automationpractice.utils.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(css = "#id_gender1")
    private WebElement radioButtonMr;

    @FindBy(css = "#id_gender2")
    private WebElement radioButtonMrs;

    @FindBy(css = "#customer_firstname")
    private WebElement inputFirstNamePersonalInfo;

    @FindBy(css = "#customer_lastname")
    private WebElement inputLastNamePersonalInfo;

    @FindBy(css = "#email")
    private WebElement inputEmail;

    @FindBy(css = "#passwd")
    private WebElement inputPassword;

    @FindBy(css = "#days")
    private WebElement selectDays;

    @FindBy(css = "#months")
    private WebElement selectMonths;

    @FindBy(css = "#years")
    private WebElement selectYears;

    @FindBy(css = "input#firstname")
    private WebElement inputFirstNameAddress;

    @FindBy(css = "#lastname")
    private WebElement inputLastNameAddress;

    @FindBy(css = "#address1")
    private WebElement inputAddressAddress;

    @FindBy(css = "#city")
    private WebElement inputCityAddress;

    @FindBy(css = "#id_state")
    private WebElement selectStateAddress;

    @FindBy(css = "#postcode")
    private WebElement inputPostalCodeAddress;

    @FindBy(css = "#id_country")
    private WebElement selectCountryAddress;

    @FindBy(css = "#phone_mobile")
    private WebElement inputMobilePhoneAddress;

    @FindBy(css = "#alias")
    private WebElement inputAliasAddress;

    @FindBy(css = "#submitAccount")
    private WebElement buttonRegister;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void register(User user) {
        // TO DO:
        // body of the register method
    }
}
