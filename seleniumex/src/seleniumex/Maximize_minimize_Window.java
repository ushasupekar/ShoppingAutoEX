package seleniumex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_minimize_Window {

	public static void main(String[] args) 
	{
		
				WebDriver wd= new ChromeDriver();
				
				wd.get("https://www.google.com/?gws_rd=ssl");
				
				wd.manage().window().maximize();
				
				try 
				{
					Thread.sleep(5000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				
				wd.navigate().refresh();
				
				wd.manage().window().minimize();
				
				wd.close();


	}

}
