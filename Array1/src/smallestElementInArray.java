
public class smallestElementInArray 
{

	public static void main(String[] args) 
	{
		int array[]= {5,1,2,3,};
		
		System.out.println("Original Array Element is :");
		for(int i=0;i<array.length;i++)
		{
			System.out.println("  "+array[i]);
			
		}	
		
		int smallestElement=array[0]; 
		
		
		for (int i=0;i<array.length;i++)
		if(array[i] < smallestElement)
			smallestElement = array[i];
		
		System.out.println("Smallest Element in array ---> "+smallestElement);

	}

}
