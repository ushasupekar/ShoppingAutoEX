import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium_Software\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://trytestingthis.netlify.app/");
		
		List<WebElement> table=driver.findElements(By.xpath("//tbody/tr/td"));
		
		System.out.println(table.size());
		
		System.out.println(table.get(11).getText());
		
		System.out.println(table.get(19).getText());
	}

}
