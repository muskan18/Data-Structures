package november16;

import java.util.Scanner;

public class longestsubstring {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string ");
		
		String st = sc.nextLine();
		
		String r = palind(st);
		
		int len = r.length();
		
		System.out.println("The longest substring is " +r+ " with a length of " +len );
	}
	
	static String palind(String s)
	{
		if(s.length() <= 1) return s;
        
        String result = "";
        
        for(int i = 0; i < s.length(); i++) {
        
        	for(int j = i; j < s.length(); j++) {
            
        		String current = s.substring(i, j + 1);
                
        		if(current.length() > result.length() && checkp(current)) 
        		{
                
        			result = current;
                }
            }
        }
        
        return result;
		
		
	}
	static boolean checkp(String s)
	{
		int i = 0;
		
        int j = s.length() - 1;
        
        while(i < j) {
        
        	if(s.charAt(i) != s.charAt(j)) 
        		return false;
            
        	i++;
        	
            j--;
        }
        
        return true;
	}
	
	
}
