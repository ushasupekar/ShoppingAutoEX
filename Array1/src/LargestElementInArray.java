
public class LargestElementInArray
{

	public static void main(String[] args)
	{
		
		//int maxElement=array[0]; 

		int array[]= {1,3,5,22,55};
		
		System.out.println("Original Array Element  :");
		for(int i=0;i<array.length;i++)
		{
			System.out.println("  "+array[i]);
			
		}	
		
		int maxElement=0; 
		//System.out.println("Maximum Array Element is : ");
		
		for (int i=0;i<array.length;i++)
		if(array[i] > maxElement)
			maxElement = array[i];
		
		System.out.println("Maximum Array Element is ---> "+maxElement);
	}

}
