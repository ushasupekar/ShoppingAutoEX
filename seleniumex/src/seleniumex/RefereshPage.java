package seleniumex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefereshPage {

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver","F:\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		
		wd.get("https://www.google.com/?gws_rd=ssl");
		
		try 
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		wd.navigate().refresh();

	}

}
