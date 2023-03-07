package Testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataParameterization 
{
  @Test
  @Parameters({"value1","value2"})
  public void addition(String name,String address)
  {
	 System.out.println(name+"  "+address);
  }
}
