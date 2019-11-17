package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeScreen extends BasePage {

    protected WebDriver driver;
    private String pageUrl = "http://the-internet.herokuapp.com";

    private By formAuthlinkLocator = By.linkText("Form Authentication");

    public HomeScreen(WebDriver driver) {
        super(driver);
    }
    public void openPage() {
        openUrl(pageUrl);
    }

    public void clickFormAuth() {

        click(formAuthlinkLocator);
    }
}
