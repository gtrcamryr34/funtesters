package testers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Taha {

    @BeforeTest

    public void SetupChrome() {

        ChromeOptions co = new ChromeOptions();
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        //Desired capablities is how we want to run it

        capabilities.setCapability(ChromeOptions.CAPABILITY, co);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\4age\\Documents\\Projects\\funtesters\\src\\main\\resources\\chromedriver.exe");

    }

    @Test

    public void OpenChrome() {

    ChromeDriver driver = new ChromeDriver();

    String google = "https:///facebook.com";


    driver.get(google);

    String title = driver.getTitle();

    String url = driver.getCurrentUrl();

        WebElement email = driver.findElement(By.name("email"));

        WebElement pass = driver.findElement(By.name("pass"));
       // WebElement login

    System.out.println("my frist automation is going to " + title + "and the link for it is " + url);

    //driver.close();

    }
}
