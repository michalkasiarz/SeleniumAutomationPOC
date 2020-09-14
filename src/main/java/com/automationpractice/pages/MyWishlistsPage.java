package com.automationpractice.pages;

import com.automationpractice.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.awaitility.Awaitility.await;

public class MyWishlistsPage extends BasePage {

    @FindBy(css = "input[id='name']")
    private WebElement inputItemName;

    @FindBy(css = "button[id='submitWishlist']")
    private WebElement buttonSaveItem;

    public MyWishlistsPage(WebDriver driver) {
        super(driver);
    }

    public void addItemToWishlist(String itemName) {
        inputItemName.sendKeys(itemName);
        buttonSaveItem.click();
    }

    public void deleteItemFromWishlist(String itemName) {
        WebElement item = driver.findElement(By.xpath("//*[contains(text(), '" + itemName + "')]"));
        String itemId = "";
        String itemOnclickAttribute = item.getAttribute("onclick");
        String regex = "\\d{5}";
        Pattern validCharacterPattern = Pattern.compile(regex);
        Matcher matcher = validCharacterPattern.matcher(itemOnclickAttribute);
        if (matcher.find()) {
            itemId = matcher.group();
        }
        item = driver.findElement(By.xpath("//a[contains(@onclick, 'wishlist_" + itemId + "')]"));
        item.click();
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
    }

    public boolean checkIfItemExists(String itemName) {
        await().atMost(10, TimeUnit.SECONDS).until(() -> !driver.findElements(By.xpath("//*[contains(text(), '" + itemName + "')]")).isEmpty());
        return true;
    }

    public boolean checkIfItemNotExist(String itemName) {
        await().atMost(10, TimeUnit.SECONDS).until(() -> driver.findElements(By.xpath("//*[contains(text(), '" + itemName + "')]")).isEmpty());
        return false;
    }
}
