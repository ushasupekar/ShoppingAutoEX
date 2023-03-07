import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class SinglebBTN {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.gecko.driver", "F:\\Selenium_Software\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		//WebDriver driver=new FirefoxDriver();
		
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		WebElement web=driver.findElement(By.xpath("//div[@id='']"));
		
		File src=web.getScreenshotAs(OutputType.FILE);
		
		
		try {
			FileHandler.copy(src, new File("ElementLevel.png"));
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
