import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame_Handle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium_Software\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demoqa.com/frames");
		
		WebElement we1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		
		driver.switchTo().frame(we1);
		
		WebElement we2=driver.findElement(By.xpath("/html[1]/body[1]/h1[1]"));
		System.out.println(we2.getText());
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame2");
		
		WebElement we3=driver.findElement(By.xpath("/html[1]/body[1]/h1[1]"));
		System.out.println(we3.getText());
		
		
		
		driver.switchTo().defaultContent();
		
		
		WebElement we4=driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe page There are 2 Iframes in this pag')]"));
		System.out.println(we4.getText());
		

	}

}
