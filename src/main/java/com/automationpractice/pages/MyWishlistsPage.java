package com.automationpractice.pages;

import com.automationpractice.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyWishlistsPage extends BasePage {

    @FindBy(css = "input[id='name']")
    private WebElement inputItemName;

    @FindBy(css = "button[id='submitWishlist']")
    private WebElement buttonSaveItem;

    public MyWishlistsPage(WebDriver driver) {
        super(driver);
    }

    public void enterItemName(String itemName) {
        inputItemName.sendKeys(itemName);
    }

    public void clickOnSaveItemButton() {
        buttonSaveItem.click();
    }

    public void deleteItemFromWishlist(String itemName) {
        WebElement item = driver.findElement(By.xpath("//*[contains(text(), '" + itemName + "')]"));
        String itemOnclickAttribute = item.getAttribute("onclick");
        String regex = "\\d{5}";
        Pattern validCharacterPattern = Pattern.compile(regex);
        Matcher matcher = validCharacterPattern.matcher(itemOnclickAttribute);
        matcher.find();
        String itemId = matcher.group();
        item = driver.findElement(By.xpath("//a[contains(@onclick, 'wishlist_" + itemId + "')]"));
        item.click();
        driver.switchTo().alert().accept();
    }

}
