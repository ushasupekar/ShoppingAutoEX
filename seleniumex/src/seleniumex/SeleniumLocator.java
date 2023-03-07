package seleniumex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocator
{

	public static void main(String[] args)
	{
		System.setProperty("WebDriver.Chrome.Driver", "F:\\Selenium_Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		
	}

}
