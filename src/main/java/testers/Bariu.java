package testers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bariu {
    @BeforeTest
    public void SetupChrome() {
        ChromeOptions co = new ChromeOptions();
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, co);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bariu\\OneDrive\\Documents\\Project\\funtesters\\src\\main\\resources\\chromedriver.exe");
    }

    @Test
    public void OpenChrome() {
        ChromeDriver driver = new ChromeDriver();
        String google = "https://facebook.com";
        driver.get(google);
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();

        WebElement email = driver.findElement(By.name("email"));
        WebElement pass = driver.findElement(By.name("pass"));

        email.sendKeys("myemail");
        pass.sendKeys("mypassword");
        System.out.println("my first Automation is going to " + title + " and the link for it is " + url);

    }
}

