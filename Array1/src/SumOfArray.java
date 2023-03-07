
public class SumOfArray 
{

	public static void main(String[] args) 
	{
		
		int Array[]= {10,20,30,40,};
		
		System.out.println("Original Array Element is :");
		for(int i=0;i<Array.length;i++)
		{
			System.out.println("  "+Array[i]);
			
		}	
		
		int sum = 0;
		
	//	System.out.println("Ascending order...");
		
		for(int i=0;i<Array.length;i++)
		{
			sum = sum + Array[i];
		}
		
		
		System.out.println("Sum of array element is--->"+sum);
		

	}

}
