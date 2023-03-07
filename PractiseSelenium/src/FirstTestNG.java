import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class FirstTestNG
{
	WebDriver d;
	@Test
	public void firefoxtext()
	{
		System.setProperty("webdriver.gecko.driver","F:\\\\Selenium_Software\\\\geckodriver-v0.32.0-win64\\\\geckodriver.exe");
		
		d=new FirefoxDriver();
		d.get("https://trytestingthis.netlify.app/");
	}
	
	@Test
	public void ChromeTest()
	{
		d=new ChromeDriver();
		d.get("https://trytestingthis.netlify.app/");
	}
	

}
