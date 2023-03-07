package seleniumex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_match {

	public static void main(String[] args)
	{
		WebDriver wd= new ChromeDriver();
		
		wd.get("https://www.tutorialspoint.com/java/index.htm");
		
		String title="Java Tutorial";
		
		String acttitle=wd.getTitle();
		
		System.out.println(acttitle);
		
		if(title.equals(acttitle))
		{
			System.out.println("PASSED...");
			
		}
		else
		{
			System.out.println("FAILED...");
		}
		
	}

}
