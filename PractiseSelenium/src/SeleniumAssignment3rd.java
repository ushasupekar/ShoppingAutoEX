import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumAssignment3rd {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium_Software\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demoqa.com/alerts");
		
	
		WebElement we1=driver.findElement(By.xpath("//button[@id='alertButton']"));
		we1.click();
		
		Alert alert1=driver.switchTo().alert();
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		alert1.accept();
		

		
		WebElement we2=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		we2.click();
	
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Alert alert2=driver.switchTo().alert();
		alert2.accept();
		
		
		WebElement we3=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		we3.click();
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert alert3=driver.switchTo().alert();
		alert3.dismiss();
		

		
		WebElement we4=driver.findElement(By.xpath("//button[@id='promtButton']"));
		we4.click();
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Alert alert4=driver.switchTo().alert();
		alert4.sendKeys("USHA");
		
		alert4.accept();

	
		

	}

}
