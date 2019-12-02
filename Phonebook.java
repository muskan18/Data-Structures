package december2;
import java.util.*;
public class Phonebook {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	     
		System.out.println("How many records you want to add ? ");
		
		int n=sc.nextInt();
	    
		sc.nextLine();
	      
	    HashMap<String,Integer> hashMap=new HashMap<>();
	    
	    for(int i=0;i<n;i++)
	    {
	    	  
	  	  System.out.println("Enter name ! ");
	    	  
	   	  String name=sc.nextLine();
	         
	   	  System.out.println("Enter number ! ");
    	  
	   	  int phone=sc.nextInt();
	         
	      hashMap.put(name, phone);
	         
	   	  sc.nextLine();
	   
	    }
	      
	      while(sc.hasNext())
	      {
	         String s=sc.nextLine();
	      
	         if(hashMap.get(s)!=null)
	         {
	         
	        	 System.out.println(s+"="+hashMap.get(s));
	         }
	         else
	         {
	         
	        	 System.out.println("Not found");
	         }
	      }
	      
	
	}
	
}
	


	
