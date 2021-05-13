package TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class first_Test extends Utils {
	
	//public static WebDriver driver;
	WebDriverWait wait;
	
	/*
	 * @BeforeMethod public void setup() {
	 * 
	 * System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
	 * driver = new ChromeDriver(); driver.manage().window().maximize(); wait = new
	 * WebDriverWait(driver,50);
	 * 
	 * }
	 */
	@Test
	public void firstTestCase() {
		System.out.println(" Running your first test case ");
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void SecondTestCase() {
		System.out.println(" running your second Testcase");
		driver.get("https://www.amazon.com/");
	}
	@Test
	public void ThirdTestCase() {
		System.out.println(" running your Third Testcase");
		driver.get("https://www.flipkart.com/");
	}
	@Test
	public void fourthTestCase() {
		System.out.println(" running your Third Testcase");
		driver.get("https://www.fcbarcelona.fr/fr/");
	}
	@Test
	public void fivthTestCase() {
		System.out.println(" running your Third Testcase");
		driver.get("https://www.manutd.com/");
	}
   
}
