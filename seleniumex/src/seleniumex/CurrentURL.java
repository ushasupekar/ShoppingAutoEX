package seleniumex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CurrentURL {

	public static void main(String[] args)
	{
		
		//System.setProperty("webdriver.gecko.driver","F:\\New folder\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		//WebDriver wd= new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","F:\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		
		wd.get("https://www.amazon.com/");
		
		String CurrentURL=wd.getCurrentUrl();
			
		System.out.println(CurrentURL);
	}
	

}
