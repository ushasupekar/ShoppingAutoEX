import java.util.Scanner;

public class OddNumber1to100
{

	public static void main(String[] args) 
	{
		int j=100;
		
		System.out.println("Odd Number of 1 to 100 ");
		
		for(int i=1;i<=j;i++)
		{
			if(i%2!=0)
			{
				System.out.println("    "+i);
			}
		}

	}

}
