import java.util.Scanner;

public class SmallestNumberin3 
{

	public static void main(String[] args) 
	{
		int a=20;
		int b=10;
		int c=55;
		
		if(a<=b && a<=c)
		{
			System.out.println("Smallest Number is--->"+a);
		}
		
		else if(b<=a && b<=c)
		{
			System.out.println("Smallest Number is--->"+b);
		}
		
		else
		{
			System.out.println("Smallest Number is--->"+c);

		}
	}

}
