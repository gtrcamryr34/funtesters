package testers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Umer {

    @BeforeTest
    public void SetupChrome() {
        ChromeOptions co = new ChromeOptions();
        //Notes Here
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, co);
        //Notes here
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    }
    @Test
    public void Login() {
        ChromeDriver driver = new ChromeDriver();
        String url = "http://the-internet.herokuapp.com/login";
        // Open website
        driver.get(url);

        String username = "tomsmith";
        String password = "SuperSecretPassword!";

        WebElement usernameLogin = driver.findElement(By.name("username"));
        WebElement passwordLogin = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login\"]/button"));

        usernameLogin.sendKeys(username);
        passwordLogin.sendKeys(password);

        loginButton.click();



    }


}
