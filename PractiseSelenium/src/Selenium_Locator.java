import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Locator 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium_Software\\geckodriver-v0.32.0-win64\\geckodriver.exe");

		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.redbus.in/");
		
		/*
		
		//driver.get("https://trytestingthis.netlify.app/");
		
		//By id & name
		
		WebElement fname=driver.findElement(By.id("fname"));
		
		fname.sendKeys("Usha");
		
		WebElement bname=driver.findElement(By.name("lname"));
		
		bname.sendKeys("Supekar");
		
		//By Tagname 
		
		WebElement tagname=driver.findElement(By.tagName("A"));
		
		tagname.click();
		
		*/
		
		//By Linktext
		
		//driver.get("https://www.amazon.in/");
		
		/*
		
		WebElement fllinkname=driver.findElement(By.linkText("Best Sellers"));
		
		fllinkname.click();
		
		// PartialLinkText
		
		WebElement partiallink=driver.findElement(By.partialLinkText("Service"));
		
		partiallink.click();
		
		//Classname
		
		//driver.get("https://www.redbus.in/");
		
		*/
		
		WebElement we=driver.findElement(By.className("manageHeaderLbl"));
		we.click();
		
	}

}
