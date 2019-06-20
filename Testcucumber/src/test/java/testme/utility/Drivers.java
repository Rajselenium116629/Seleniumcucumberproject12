package testme.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Drivers {
	public static WebDriver getDriver(String browser)
	{
		WebDriver driver=null;
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
	
		}
		return driver;
		
		
	}

}
