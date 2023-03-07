import java.util.Scanner;

public class Swap2Numbers 
{

	public static void main(String[] args)
	{
			int a,b,c;
		
		   Scanner sc=new Scanner(System.in);
		   
		   System.out.println("Enter value a and b");
		   
		   a=sc.nextInt();
		   b=sc.nextInt();
		   
		   System.out.println("Before swaping numbers:"+a+"   "+b);
		   
		   c=a;
		   a=b;
		   b=c;
		   
		   System.out.println("After swapping: "+a+"   " +b);  
		   
	}

}
