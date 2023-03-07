import java.util.Scanner;

public class simpleArray 
{

	public static void main(String[] args) 
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of array");	
		
			 int b=sc.nextInt();
			
			 int a[]=new int [b];
			
			//int array[b];
			
			for(int i=0;i<b;i++)
			{
				 a[i]=sc.nextInt();
			}
			
			System.out.println("Save array elements");
			
			for(int i=0;i<b;i++)

			{
				System.out.println(a[i]);

			}
			
			
			System.out.println("Show array"+b);	

		
	}*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of array");
		
		int s=sc.nextInt();
		
		int array[]= new int[5];
		
		for(int i=0;i<5;i++)
		{
			 array[i]=sc.nextInt();
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(array[i]);
		}

	}*/
		
		
		 
		Scanner sc=new Scanner(System.in);  
		System.out.println("how many elements store in array??? ");  
		
		int b=sc.nextInt();  
		
		int a[];
		a = new int[5];  
		
		System.out.println("Enter array elements!!! ");  
		for(int i=0; i<b; i++)  
		{  
		 
		a[i]=sc.nextInt();  
		}  
		System.out.println("Stored Array elements are---> ");  
		
		for (int i=0; i<b; i++)   
		{  
		System.out.print("  "+a[i]);  
		}  
}
}
