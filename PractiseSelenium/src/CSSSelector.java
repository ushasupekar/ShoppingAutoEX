import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelector
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium_Software\\geckodriver-v0.32.0-win64\\geckodriver.exe");

		
		WebDriver driver=new FirefoxDriver();
		
		/*driver.get("https://trytestingthis.netlify.app/");

		WebElement css=driver.findElement(By.cssSelector("input#lname"));
		
		css.sendKeys("Deep_Sony");*/
		
		//class
		
		driver.get("https://www.redbus.in/");
		
		WebElement we=driver.findElement(By.cssSelector("div.manageHeaderLbl"));
		
		we.click();
		
		//attribute
		
		driver.get("https://trytestingthis.netlify.app/");
		
		WebElement css=driver.findElement(By.cssSelector("input[name='lname']"));
		
		css.sendKeys("Sanu_Didi");
	}

}
