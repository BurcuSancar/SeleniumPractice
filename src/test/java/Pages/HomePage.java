package Pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends Page {

    public final String myAccountButton = "myAccount";
    public final String enterButton = "login";


    public HomePage(WebDriver driver) {
        super(driver);
    }
}
