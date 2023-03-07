import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindow {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium_Software\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		WebElement we1=driver.findElement(By.xpath("//button[@id='tabButton']"));
		
		we1.click();
		
		String mainwindow=driver.getWindowHandle();
		
		System.out.println(mainwindow);
		Set<String> set=driver.getWindowHandles();
		
		Iterator<String>itr=set.iterator();
		
		while(itr.hasNext())
		{
		
			String childWindow=itr.next();
			
			if(!mainwindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				
			    System.out.println(driver.getCurrentUrl());
				
			    WebElement we2=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
			   
			    System.out.println(we2.getText());  
			   
				driver.close();
				
			}
				
		}

	}

}
