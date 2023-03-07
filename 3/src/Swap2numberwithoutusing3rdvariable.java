import java.util.Scanner;

public class Swap2numberwithoutusing3rdvariable 
{

	public static void main(String[] args)
	{
		int a=15;
		int b=20;
		
		System.out.println("Before Swapping\n"+a+ "  "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping\n"+a+ "  "+b);
	}

}
