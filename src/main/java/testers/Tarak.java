package testers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tarak  {

    @BeforeTest
    public void SetupChrome()  {
        ChromeOptions co = new ChromeOptions();
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, co);
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

    }

    @Test
    public void login() {
        ChromeDriver driver = new ChromeDriver();
        String url = "http://the-internet.herokuapp.com/login";

        driver.get(url);

        String username = "tomsmith";
        String password = "SuperSecretPassword!";





    }

}
