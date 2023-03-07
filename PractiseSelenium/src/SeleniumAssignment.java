import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumAssignment {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium_Software\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		WebElement we1=driver.findElement(By.xpath("//input[@id='uname']"));
		
		we1.sendKeys("test");
		
		
		WebElement we2=driver.findElement(By.xpath("//input[@id='pwd']"));
		we2.sendKeys("test");
		
		WebElement we3=driver.findElement(By.xpath("//body/div[3]/div[1]/fieldset[1]/form[1]/div[1]/input[3]"));
		
		we3.submit();
		
		
	}

}
