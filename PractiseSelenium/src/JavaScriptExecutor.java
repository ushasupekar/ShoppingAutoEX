import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutor {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium_Software\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://trytestingthis.netlify.app/");	
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('fname').value='USHA'");
		js.executeScript("document.getElementById('lname').value='SUPEKAR'");

	}

}
