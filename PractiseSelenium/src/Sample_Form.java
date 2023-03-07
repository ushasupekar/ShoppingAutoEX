import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample_Form {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium_Software\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		
		
		WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Your Sample Alert Button!')]"));
		
		button.click();
		
		Alert alert=driver.switchTo().alert();
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//alert.accept();
		
		alert.dismiss();
		
		
		
		
		
		
		
		/*
		WebElement multiple=driver.findElement(By.id("owc"));
		
		Select multilist=new Select(multiple);
		
		multilist.selectByVisibleText("Option 3");
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		multilist.selectByVisibleText("Option 1");
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		multilist.deselectAll();
		
		*/
		
		
		
		/*WebElement dropdownelement = driver.findElement(By.id("option"));
		
		Select dropdown =new Select(dropdownelement);
		
		
		List<WebElement> list=dropdown.getOptions();
		System.out.println(list.size());
		*/
		
		//dropdown.selectByVisibleText("Option 3");
		
		//dropdown.selectByValue("option 1");
		
		//dropdown.selectByIndex(3);

	}

}
