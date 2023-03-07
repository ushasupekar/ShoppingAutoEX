
public class Assignment2
{

	public static void main(String[] args) 
	{
		int a1=0;
		int a2=1;
		int a3,i;
		int sum=11;
				
		System.out.println(a1+ " "+a2);
		
		for(i=2;i<sum;++i)
		{
			a3=a1+a2;
			
			System.out.println(" "+a3);
			
			a1=a2;
			a2=a3;
		}
	}

}
