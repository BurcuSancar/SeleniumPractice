package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTests {
    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;


    @BeforeEach
    void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
    }

    @Test
    void hepsiburadaLoginTest() throws InterruptedException {
        driver.get("https://www.hepsiburada.com/");

        homePage.elementWaiting(homePage.myAccountButton);

        driver.findElement(By.id("myAccount")).click();

        Thread.sleep(3000);

        homePage.elementWaiting(homePage.enterButton);

        driver.findElement(By.id("login")).click();

        loginPage.elementWaiting(loginPage.emailButton);

        loginPage.textFields(loginPage.emailButton, "seleniumdeneme@gmail.com");

        loginPage.elementWaiting(loginPage.loginButton);

        driver.findElement(By.id("btnLogin")).click();
    }
    @AfterEach
    void tearDown() {

        driver.close();
    }
}