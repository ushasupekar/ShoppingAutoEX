
public class DescendingOrderArray 
{

	public static void main(String[] args) 
	{
		
		int arr[]= {10,20,30,40,50};
		
		System.out.println("Original Array :");
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(" "+arr[j]);
		
		}
		System.out.println("\n----------------------------------");
		
		int n = 0;
		
		for(int j=0;j<arr.length;j++)
		{
			for(int i=j+1;i<arr.length;i++)
			{
				if(arr[j]<arr[i])
				{
					    
		             n = arr[j];    
		             arr[j] = arr[i];    
		             arr[i] = n;   
				}
			}
		}
		
		System.out.println("Array in Descending Order--->");
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.print("  "+arr[j]);;
		}	
	}

}
