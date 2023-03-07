package seleniumex;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium_Software\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://trytestingthis.netlify.app/");
		
		File src=((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);

		try 
		{
			FileHandler.copy(src, new File("Fullpage.jpeg"));
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		
		
		
	}

}
