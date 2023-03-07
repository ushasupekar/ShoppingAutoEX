import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium_Software\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		WebElement we1=driver.findElement(By.xpath("//input[@id='fname']"));
		we1.sendKeys("Usha");
		
		
		WebElement we2=driver.findElement(By.xpath("//input[@id='lname']"));
		we2.sendKeys("Supekar");
		
		WebElement we3=driver.findElement(By.xpath("//input[@id='female']"));
		we3.click();
		System.out.println(we3.isSelected());
		
		*/
		
		WebElement dropdownelement = driver.findElement(By.id("option"));
		
		Select dropdown =new Select(dropdownelement);
		dropdown.selectByVisibleText("option 1");
		
		dropdown.selectByValue("option 1");
		
		dropdown.selectByIndex(1);
		
		
		/*
		WebElement we4=driver.findElement(By.xpath("//body/div[3]/div[2]/form[1]/fieldset[1]/input[8]"));
		we4.click();
		System.out.println(we4.isSelected());
		
		WebElement we5=driver.findElement(By.xpath("//textarea[contains(text(),'The cat was playing in the garden.')]"));
		
		we5.clear();
		we5.sendKeys(" Welcome to Selenium!!!!");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		WebElement we6=driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		
		we6.click();
		*/
	}

}
