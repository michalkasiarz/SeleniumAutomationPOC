package org.automationpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.automationpractice.pages.LandingPage;
import org.automationpractice.pages.LoginPage;
import org.automationpractice.pages.RegisterPage;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    protected WebDriver driver;

    protected LandingPage landingPage;
    protected LoginPage loginPage;
    protected RegisterPage registerPage;

    @BeforeClass
    public static void setupWebDriverManager() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        landingPage = new LandingPage(driver);
        driver.get("http://automationpractice.com");
        loginPage = new LoginPage(driver);
        registerPage = new RegisterPage(driver);
    }

    @After
    public void tearDown() {
        if (driver != null) {
//            driver.quit();
        }
    }
}
