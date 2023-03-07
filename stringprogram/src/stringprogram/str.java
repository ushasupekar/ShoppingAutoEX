package stringprogram;

public class str
{

	public static void main(String[] args)
	{
		String s ="Apple";
	    String s1 ="Apple";
	    
	    System.out.println(s1);      //print normal string
	    
	    String s2=new String("Pune");
	    System.out.println(s2);
	    
	    String str =20+20+"pune mumbai pune"+20+50;
	    System.out.println(str);
	    
	    System.out.println(s.equals(s1));   //string literal use
	    
	    String s11=new String("Thane");      //using new keyword
	    String s12=new String("Goa");
	    
	    System.out.println(s11.equals(s12));
	    
	    String e=new String("Usha");
	    String e1=new String("Usha");

	    System.out.println(s.equals(e1));
	    
	    String w="nagar";   //string compare
	    String w1="nagar";

	    System.out.println(w==w1);
	    
	    String q=new String("Nagar");
	    String q1=new String("Nagar");
	    System.out.println(q==q1);
	    
	    String r=new String("jay");           
	    String r1=new String("shree");
	    
	    System.out.println(r.concat(r1));   //concatination 
	    
	    System.out.println(r1.length());     //length
	    
	    System.out.println(r1.charAt(3));     //charAt
	    
	    
	    String d=("Good Morning");
	    
	    System.out.println(d.contains("night"));      //contents
	    System.out.println(d.contains("Good"));

	    System.out.println(d.replace("o", "i"));
	    
	   System.out.println(q.compareTo(q1));     //compareto

	   System.out.println(r.endsWith(r1));
	   
	   
	   
	   String k=new String("Usha Deepak Supekar");           

	   
	   System.out.println(k.indexOf("p"));
	   System.out.println(k.charAt(8));
	   
	   
	}

}
