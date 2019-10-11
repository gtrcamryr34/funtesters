package testers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Umer {

	public static void main(String[] args) {
		
		//set property for where the chrome driver is located
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Umer\\eclipse-workspace\\funtesters\\src\\main\\resources\\chromedriver.exe");
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette",true);
		ChromeOptions co = new ChromeOptions();
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, co);
		
		
		//Initiate webdriver
		ChromeDriver driver = new ChromeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		//Open the Webpage
		driver.get("https://www.google.com");
		
		//Get the Webpage title
		String title = driver.getTitle();
		
		//Print the Webpage title
		System.out.println(title);
		
		//Close the Webpage
		//driver.close();

		
		
		
		
		
		

	}

}
