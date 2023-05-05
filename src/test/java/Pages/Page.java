package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Page {
    private final WebDriver driver;

    public Page(WebDriver driver) {
        this. driver = driver;
    }

    public void elementWaiting(String elementId) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));
    }

    public void textFields(String elementId, String emailAddress) {
        driver.findElement(By.id(elementId)).sendKeys(emailAddress);
    }
}
