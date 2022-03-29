	package chrome;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	RemoteWebDriver driver;

	@Test
	public void loginToLeafTaps() {
                 // Read the param   
		
		String browser = System.getProperty("browser");
		System.out.print(browser);
		if(browser == null){
			browser = "chrome";
		}
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver = new ChromeDriver(); 
		}else if(browser.equals("edge")) {
			System.setProperty("webdriver.chrome.driver", "./edgedriver.exe");
			driver = new EdgeDriver();
			
		}
		
			
		

		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByClassName("decorativeSubmit").click();
		driver.close();
	}


}
