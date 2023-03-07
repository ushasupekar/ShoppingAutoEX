import java.util.Scanner;

public class LargestNumberin3 
{

	public static void main(String[] args) 
	{
		int a=50;
		int b=20;
		int c=30;
		
		if(a>=b && a>=c)
		{
			System.out.println("Largest Number is--->"+a);
		}
		
		else if(b>=a && b>=c)
		{
			System.out.println("Largest Number is--->"+b);
		}
		
		else
		{
			System.out.println("Largest Number is--->"+c);

		}

	}

}
