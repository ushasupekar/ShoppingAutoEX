
import java.io.File;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ColorPicker {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium_Software\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://trytestingthis.netlify.app/");	
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('favcolor').value='#FF0000'");
		
			
	}

}
