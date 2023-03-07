import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement w1=driver.findElement(By.linkText("Mobiles"));
		
		w1.click();
		
		List<WebElement>weblist = driver.findElements(By.tagName("a"));
		System.out.println(weblist);
		
		System.out.println(weblist.size());
	}

}
