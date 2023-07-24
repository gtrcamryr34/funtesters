package testers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TarakFacebookLogin {

    @BeforeTest
    public void SetupChrome () {
        ChromeOptions co = new ChromeOptions();
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, co);
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    }

    @Test
    public void login () {
        ChromeDriver driver = new ChromeDriver();
        String url = "https://facebook.com";
        driver.get(url);

        String username = "123";
        String password = "123";

        WebElement usernamelogin = driver.findElement(By.name("email"));
        WebElement passwordlogin = driver.findElement(By.name("pass"));


        usernamelogin.click();
        usernamelogin.sendKeys(username);

        passwordlogin.click();
        passwordlogin.sendKeys(password);

        driver.findElement(By.id("u_0_2")).click();

    }




}
