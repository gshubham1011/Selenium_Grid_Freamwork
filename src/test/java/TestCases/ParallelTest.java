package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTest extends Utils{

	
 @Test
  public void FirefoxTest() throws InterruptedException {	 
//Initializing the firefox driver (Gecko)
	 System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());	
	  driver.get("https://www.demoqa.com"); 
	  Thread.sleep(2000);
  }
 
 @Test
 	public void ChromeTest()
 	{ 
	  //Initialize the chrome driver
	 System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
	 driver.get("https://www.demoqa.com"); 	 
 	}

}
