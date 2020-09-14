package com.automationpractice;

import com.automationpractice.pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    protected WebDriver driver;

    protected LandingPage landingPage;
    protected LoginPage loginPage;
    protected RegisterPage registerPage;
    protected MyAccountPage myAccountPage;
    protected MyWishlistsPage myWishlistsPage;
    protected MyAddressesPage myAddressesPage;
    protected MyCreditSlipsPage myCreditSlipsPage;
    protected MyPersonalInformationPage myPersonalInformationPage;
    protected OrderHistoryAndDetailsPage orderHistoryAndDetailsPage;
    protected ShoppingCartPage shoppingCartPage;

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
        landingPage = new LandingPage(driver);
        driver.get("http://automationpractice.com");
        loginPage = new LoginPage(driver);
        registerPage = new RegisterPage(driver);
        myAccountPage = new MyAccountPage(driver);
        myWishlistsPage = new MyWishlistsPage(driver);
        myAddressesPage = new MyAddressesPage(driver);
        myCreditSlipsPage = new MyCreditSlipsPage(driver);
        myPersonalInformationPage = new MyPersonalInformationPage(driver);
        orderHistoryAndDetailsPage = new OrderHistoryAndDetailsPage(driver);
        shoppingCartPage = new ShoppingCartPage(driver);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}