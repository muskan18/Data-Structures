package december5;

import java.util.*;

public class prime {

	public static void main(String args[])
	{	
	Scanner sc=new Scanner(System.in);
	    
	System.out.println("Enter the number ! ");
	
	   int a=sc.nextInt();
	
	   prime(a);
	    
	
	}
	
	static void prime(int num)
	{
		int c=0;
		
		int e=0;
		
	    for(int i=1;i<num;i++) 
			
	    	if(num%i==0)
	    
	    	{
	    for(int d=2;d<i;d++) 
	
	    	if(i%d==0) 
	    		e++;
	    
	    if(e==0)
	    	c=i;
	    
	    e=0;
	    
	    }
	   System.out.println(c);
		
		
	}
	
	}
