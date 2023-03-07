
public class RemoveDuplicateElement
{

	public static void main(String[] args) 
	{
		
			int count;
			int [] duplicate = new int[5];
			int index = 0;
			
		 
			
			int arr[]= {10,10,20,30,30,40,50,50};
			
			System.out.println("Original Array :");
			
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(" "+arr[j]);
			
			}
			System.out.println("\n----------------------------------");
			
			
			for(int i=0;i<arr.length;i++)
			{
				count = 0;
				for(int j=i+1;j<arr.length;j++)	
				{
					if(arr[i]==arr[j])
					{
						count = count + 1;
						break;
						
					}
				}
				
				
				if(count==0)
				{
					duplicate[index]=arr[i];
					index++;
				}
			}

			
			for(int i=0;i<index;i++)
			{
				arr[i]=duplicate[i];
			}
			
			System.out.println("Dulpicate element is remove :");
			
			for(int i=0;i<index;i++)
			{
				System.out.print(" "+arr[i]);
			}
			
			
	}

}
