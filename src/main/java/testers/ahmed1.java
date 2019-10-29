package testers;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ahmed1 {



	@BeforeTest
	public void SetupChrom() {
		ChromeOptions co = new ChromeOptions();
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, co);

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Umer\\Documents\\Projects\\funtesters\\src\\main\\resources\\chromedriver.exe");

		//Initiate webdriver


	}
	@Test(priority = 1)
	public void OpenGoogle() {
		
		//set property for where the chrome driver is located PLEASE CHANGE TO THE LOCATION OF THE DRIVER ON YOUR LAPTOP
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette",true);

		//FirefoxDriver driver = new FirefoxDriver();
		ChromeDriver driver = new ChromeDriver();

		//Open the Webpage
		driver.get("https://www.google.com");
		
		//Get the Webpage title
		String title = driver.getTitle();
		
		//Print the Webpage title
		System.out.println(title);

		//Close Browser
		driver.close();
		
	}

}
