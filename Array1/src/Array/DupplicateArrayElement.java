package Array;



public class DupplicateArrayElement
{

	public static void main(String[] args) 
	{
		int array[]= {1,2,2,3,4,4,5,6};
		
		System.out.println("Print Original Array Element :");
		for(int i=0;i<array.length;i++)
		{
			System.out.println("  "+array[i]);
			
		}	
		
    	System.out.println("Duplicate Element is :");

		for(int j=0;j<array.length;j++) 
		{  
            for(int l=j+1;l<array.length;l++) 
            {  
            	
                if(array[j] == array[l])  
                    System.out.print("  "+array[l]);  
                
                
            }
	
		}
	}
}
