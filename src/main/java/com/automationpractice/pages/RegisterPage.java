package com.automationpractice.pages;

import com.automationpractice.BasePage;
import com.automationpractice.utils.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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

    public void chooseTitle(User user) {
        if (user.getTitle().equals("Mr.")) {
            radioButtonMr.click();
        } else {
            radioButtonMrs.click();
        }
    }

    public void enterFirstNamePersonalInfo(String firstName) {
        inputFirstNamePersonalInfo.sendKeys(firstName);
    }

    public void enterLastNamePersonalInfo(String lastName) {
        inputLastNamePersonalInfo.sendKeys(lastName);
    }

    public void enterPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void selectBirthdate(User user) {
        Select selectDay = new Select(selectDays);
        selectDay.selectByValue(user.getDateOfBirthDay());

        Select selectMonth = new Select(selectMonths);
        selectMonth.selectByVisibleText(user.getDateOfBirthMonth() + " ");

        Select selectYear = new Select(selectYears);
        selectYear.selectByVisibleText(user.getDateOfBirthYear() + "  ");
    }

    public void enterFirstNameForAddress(String firstName) {
        inputFirstNameAddress.sendKeys(firstName);
    }

    public void enterLastNameForAddress(String lastName) {
        inputLastNameAddress.sendKeys(lastName);
    }

    public void enterFullAddress(String address) {
        inputAddressAddress.sendKeys(address);
    }

    public void enterCity(String city) {
        inputCityAddress.sendKeys(city);
    }

    public void selectState(User user) {
        Select selectState = new Select(selectStateAddress);
        selectState.selectByVisibleText(user.getStateAddress());
    }

    public void enterPostalCode(String postalCode) {
        inputPostalCodeAddress.sendKeys(postalCode);
    }

    public void selectCountry(User user) {
        Select selectCountry = new Select(selectCountryAddress);
        selectCountry.selectByVisibleText(user.getCountryAddress());
    }

    public void enterMobilePhone(String mobilePhoneNumber) {
        inputMobilePhoneAddress.sendKeys(mobilePhoneNumber);
    }

    public void enterAliasAddress(String aliasAddress) {
        inputAliasAddress.sendKeys(aliasAddress);
    }

    public void clickButtonRegister() {
        buttonRegister.click();
    }

    public void register(User user) {
        chooseTitle(user);
        enterFirstNamePersonalInfo(user.getFirstNamePersonalInfo());
        enterLastNamePersonalInfo(user.getLastNamePersonalInfo());
        enterPassword(user.getPassword());
        selectBirthdate(user);
        enterFirstNameForAddress(user.getFirstNameAddress());
        enterLastNameForAddress(user.getLastNameAddress());
        enterFullAddress(user.getAddressAddress());
        enterCity(user.getCityAddress());
        selectState(user);
        enterPostalCode(user.getPostalCodeAddress());
        selectCountry(user);
        enterMobilePhone(user.getMobilePhone());
        enterAliasAddress(user.getAlias());
        clickButtonRegister();
    }
}