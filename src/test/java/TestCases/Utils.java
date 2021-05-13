package TestCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Utils {

	public WebDriver driver;
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		System.out.println("Setup");
		
		//1. define Des Cap
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		//2. Chrome Options definition:
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String hubUrl="http://192.168.43.164:4444/wd/hub";
		driver = new RemoteWebDriver(new URL(hubUrl), options);
		
		 //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		// driver = new ChromeDriver();
	}
	 @AfterMethod
	public void browerstop() {
			driver.close();
	}
}
