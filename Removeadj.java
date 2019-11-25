package november25;

import java.util.Scanner;

public class Removeadj {

	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string ");
		
		String str = sc.next();
		
		String result = removeadjelement(str);
	
		sc.close();
		
		System.out.println("Resultant : " +result);
	}
	
	
	static String removeadjelement(String s)
	{
	
		int len = s.length();
		
		for(int i=0; i<len-1; i++){
            if(s.charAt(i) == s.charAt(i+1))
                return removeadjelement(s.substring(0, i).concat(s.substring(i+2)));
        }
        return s;
		
		
	}
	
	
}
