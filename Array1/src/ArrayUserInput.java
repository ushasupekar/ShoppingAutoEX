import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args)
	{
		  
		Scanner sc=new Scanner(System.in);  
		
		System.out.print("Enter how many elements...??? ");  
		int b=sc.nextInt(); 
		
		int arr[]=new int[5];                     //declaration & initialization array
		
		System.out.println("Enter the array elements :- ");  
		
		for(int i=0; i<b; i++)  
		{  
		   
			arr[i]=sc.nextInt();  
		}  
		System.out.println("Showing the array elements :- ");  
		 
		for (int i=0; i<b; i++)   
		{  
			System.out.print(" "+arr[i]);  
		}  
		
	}

}
