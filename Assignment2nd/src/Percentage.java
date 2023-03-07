import java.util.Scanner;
public class Percentage 
{

	public static void main(String[] args)
	{
		
		        Scanner sc = new Scanner(System.in); 
		        int n;   
		        
		        System.out.println("Enter the total subjects : ");
		        n=sc.nextInt();
		        
		        int arr[] = new int[n]; 
		        System.out.println("Enter the marks in each subject : ");
		        for(int i=0;i<=3;i++)   
		        {
		            arr[i]=sc.nextInt();
		        }
		        
		        int total=0;
		        
		        for(int i=0;i<n;i++)
		        {
		            total=total+arr[i];
		        }
		       
		        System.out.println("The total marks is : "+total);
		        
		        float percentage; 
		        percentage = (total / (float)n); 
		        
		        System.out.println( "Total Percentage : " + percentage + "%");                         
	}   

}
