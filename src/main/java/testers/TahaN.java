package testers;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TahaN {

    @BeforeTest
    public void

    SetupChrome() {

        ChromeOptions co = new ChromeOptions();
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, co);

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe"); //set what driver to pull and mention the location of the driver
    }
    @Test
    public void Login() {
        ChromeDriver driver = new ChromeDriver();
        String url = "http://the-internet.herokuapp.com/login";
        //open website
        driver.get(url);
        String username = "tomsmith";
        String password = "SuperSecretPassword!";
//*[@id="login"]/button/i
        WebElement usernameLogin = driver.findElement(By.name("username"));
        WebElement passwordLogin = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login\"]/button/i"));

       // usernameLogin.click();

        usernameLogin.sendKeys(username);
        passwordLogin.sendKeys(password);
        //usernameLogin.isDisplayed();

        loginButton.click();
     }

}
