
package seleniumex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byid 
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		
		//WebElement fname=driver.findElement(By.id("fname"));
		
	}

}
