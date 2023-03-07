import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle_Multiple_Windows {

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
		
		driver.switchTo().window(mainwindow);
		WebElement we3=driver.findElement(By.xpath("//button[@id='windowButton']"));
		
		we3.click();
		
		
		
		String window1=driver.getWindowHandle();
		System.out.println(window1);
		
		Set<String> w1=driver.getWindowHandles();
		
		Iterator<String>itr1=w1.iterator();
		
		while(itr1.hasNext())
		{
		
			String childWindow1=itr1.next();
			
			if(!window1.equals(childWindow1))
			{
				driver.switchTo().window(childWindow1);
				
			    System.out.println(driver.getCurrentUrl());
				
			    WebElement we4=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
			   
			    System.out.println(we4.getText());  
			   
				driver.close();
				
			}
				
		}
		
		driver.switchTo().window(mainwindow);
		
		WebElement web1=driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
		
		web1.click();
		
		String mainwindow2=driver.getWindowHandle();
		System.out.println(mainwindow2);
		
		Set<String> set2=driver.getWindowHandles();
		
		Iterator<String>itr2=set2.iterator();
		
		while(itr2.hasNext())
		{
		
			String childWindow3=itr.next();
			
			if(!mainwindow2.equals(childWindow3))
			{
				driver.switchTo().window(childWindow3);
				
			    System.out.println(driver.getCurrentUrl());
				
			    WebElement we5=driver.findElement(By.xpath("/html[1]/body[1]"));
			   
			    System.out.println(we5.getText());  
			    
			    try {
					Thread.sleep(2500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			   
				driver.close();
				
			}
				
		}
		
		driver.switchTo().window(mainwindow2);

		
	}

}
