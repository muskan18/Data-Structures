package december12;

import java.util.*;

public class addingwithoutoperator {

	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number !" );
		
		int fno = sc.nextInt();
		
		System.out.println("Enter the second number !");
		
		int sno = sc.nextInt();
		
		sc.close();
		
		sum(fno,sno);
		
	}
	
	static void sum(int a,int b)
	{
		
		int c;
		
		while(b!=0)
		{
			c = a&b;
			
			a = a^b;
			
			b= c<<1;
			
			
		}
		
		System.out.println(a);
		
		
	}
	
}
