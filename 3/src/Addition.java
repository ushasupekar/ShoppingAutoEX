import java.util.Scanner;

public class Addition 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		{
			System.out.println("Enter 1st number:");
			int a=sc.nextInt();
			
			System.out.println("Enter 2nd number:");
			int b=sc.nextInt();
			
			int sum=a+b;
			
			System.out.println("Sum of two numbers!!!\n"+sum);
		}

	}

}
