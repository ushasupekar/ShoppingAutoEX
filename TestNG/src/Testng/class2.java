package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class class2 
{
	@BeforeTest
	  void btest()
	  {
		  System.out.println("B test class 2");
	  }
	  
	  @Test
	  public void f()
	  {
		  System.out.println("class two.");
	  }
	  
	  @AfterTest
	  void aftersuite()
	  {
		  System.out.println("After test class two");
	  }
}
