import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium_Software\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://trytestingthis.netlify.app/");
		
		WebElement web=driver.findElement(By.xpath("//input[@id='myfile']"));
		web.sendKeys("C:\\Users\\Home\\Desktop\\ABHI\\sql.jpeg.xlsx");
		
	}

}
