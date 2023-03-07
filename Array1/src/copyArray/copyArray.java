package copyArray;

public class copyArray 
{

	public static void main(String[] args) 
	{
		int array1[]={5,10,15,20,25,};

		int array2[];
		array2=array1;
		
		System.out.print("Elements of array1 :");
		
		for(int i=0;i<5;i++)
		System.out.println(" "+array1[i]);
		
		System.out.println("Elements of array2 :");
		
		for(int i=0;i<5;i++)
		//System.out.println(" "+array2[i]);
		System.out.print(" "+array2[i]); 	
	}

}
