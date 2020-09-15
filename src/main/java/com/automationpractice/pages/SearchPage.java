package com.automationpractice.pages;

import com.automationpractice.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    @FindBy(css = "#center_column > ul > li:nth-child(2) > div > div.left-block > div > a.product_img_link > img")
    private WebElement secondElementFound;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]")
    private WebElement buttonAddToCart;

    @FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
    private WebElement buttonProceedToCheckout;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void addProductToCartAndProceedCheckout() {
        Actions actions = new Actions(driver);
        actions.moveToElement(secondElementFound).build().perform();
        buttonAddToCart.click();
        buttonProceedToCheckout.click();
    }

}
