package com.automationpractice;

import com.automationpractice.pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;

    protected LandingPage landingPage;
    protected LoginPage loginPage;
    protected RegisterPage registerPage;
    protected MyAccountPage myAccountPage;
    protected MyWishlistsPage myWishlistsPage;
    protected MyAddresses myAddresses;

    @BeforeClass
    public static void setupWebDriverManager() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        landingPage = new LandingPage(driver);
        driver.get("http://automationpractice.com");
        loginPage = new LoginPage(driver);
        registerPage = new RegisterPage(driver);
        myAccountPage = new MyAccountPage(driver);
        myWishlistsPage = new MyWishlistsPage(driver);
        myAddresses = new MyAddresses(driver);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    protected void waitForLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = driver1 -> {
            assert driver1 != null;
            return ((JavascriptExecutor) driver1).executeScript("return document.readyState").equals("complete");
        };
    }
}