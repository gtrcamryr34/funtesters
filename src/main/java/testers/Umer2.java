package testers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Umer2 {

    @BeforeTest
    public void SetupChrome() {
        ChromeOptions co = new ChromeOptions();
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, co);

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Umer\\Documents\\Projects\\funtesters\\src\\main\\resources\\chromedriver.exe");

    }

    @Test
    public void OpenChrome() {
        ChromeDriver driver = new ChromeDriver();
        String google = "https://google.com";

        driver.get(google);

        String title = driver.getTitle();

        String url = driver.getCurrentUrl();

        System.out.println("My First Automation is going to " + title + " and the link for it is " + url );

        driver.close();











    }

}
