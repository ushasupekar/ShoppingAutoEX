package seleniumex;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {

	public static void main(String[] args)
	{
		System.out.println("Usha");
		
		//System.setProperty("webdriver.gecko.driver","F:\\New folder\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		//WebDriver wd= new FirefoxDriver();
		
		
		
		
	
		
		System.setProperty("webdriver.chrome.driver","F:\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		
		wd.get("https://www.google.com/?gws_rd=ssl");
		
		wd.navigate().refresh();
		
		
		
		
}

}
