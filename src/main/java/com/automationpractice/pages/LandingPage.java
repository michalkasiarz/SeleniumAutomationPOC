package com.automationpractice.pages;

import com.automationpractice.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class LandingPage extends BasePage {

    @FindBy(css = "a.login")
    private WebElement buttonSignIn;

    @FindBy(css = "#search_query_top")
    private WebElement inputSearch;

    @FindBy(css = "button.button-search")
    private WebElement buttonSubmitSearch;

    @FindBy(css = "a.product-name")
    private WebElement product;

    @FindBy(xpath = "a[title=\"Women\"]")
    private WebElement buttonWomenCategory;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    private WebElement buttonTshirts;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    private WebElement buttonDresses;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void clickButtonSignIn() {
        buttonSignIn.click();
    }

    public void searchForItem(String itemName) {
        inputSearch.sendKeys(itemName);
        buttonSubmitSearch.click();
    }

    public void selectRandomCategory() {
        List.of(buttonWomenCategory, buttonDresses, buttonTshirts).get(new Random().nextInt(3)).click();
    }
}
