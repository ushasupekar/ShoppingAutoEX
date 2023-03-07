import java.util.Scanner;
public class Discount
{

	public static void main(String[] args) 
	{
		
		
		  float TotalpurchaseCost, Paid, Discount;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter Total Amount: ");
	      TotalpurchaseCost = scan.nextFloat();
	      
	      if(TotalpurchaseCost<=199)
	      {
	    	  System.out.println("No Discount!!!");
	    	  Paid = TotalpurchaseCost;
	      }
	      else if(TotalpurchaseCost>=200)
	      {
	    	 Discount = (TotalpurchaseCost*15)/100;
	         Paid = TotalpurchaseCost - Discount;
	      }
	      else if(TotalpurchaseCost<=500)
	      {
	    	 Discount = (TotalpurchaseCost*20)/100;
	         Paid = TotalpurchaseCost - Discount;
	      }
	      else
	      {
	    	 Discount = (TotalpurchaseCost*25)/100;
	         Paid = TotalpurchaseCost - Discount;
	      }
	      System.out.println("\nThe Paid amount is: " + Paid);
		
		
	}		
	
}
