package testers;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Umer {



	@BeforeTest
	public void SetupChrom() {
		ChromeOptions co = new ChromeOptions();
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, co);


		//Initiate webdriver


	}
	@Test
	public void OpenGoogle() {
		
		//set property for where the chrome driver is located PLEASE CHANGE TO THE LOCATION OF THE DRIVER ON YOUR LAPTOP
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bariu\\OneDrive\\Documents\\Project\\funtesters\\src\\main\\resources\\chromedriver.exe");
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
		
		//Close the Webpage
		driver.close();

	}

	}

