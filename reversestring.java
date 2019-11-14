package november14;

import java.util.*;

public class reversestring {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String str = sc.nextLine();
		
		reverse(str);
		
	}
	
	static void reverse(String str)
	{
		
        char arr[] = new char[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
        
        	if (str.charAt(i) < 48 || (str.charAt(i) > 57 && str.charAt(i) < 65) || (str.charAt(i) > 90 && str.charAt(i) < 97) || str.charAt(i) > 122)
                arr[i] = str.charAt(i);
            else
                arr[i] = '0';
        }
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
        
        	stack.push(str.charAt(i));
        }
        
        
        int i=0;
        
        while(!stack.isEmpty()){
        
        	char pop = stack.pop();
            
        	if (!(pop < 48 || (pop > 57 && pop < 65) || (pop > 90 && pop < 97) || pop > 122)){
                arr[i] = pop;
                ++i;
            }
            
        	if(arr[i]!='0'){
                ++i;
            }
        }
        
        
        for ( i = 0; i < str.length(); i++) {
        
        	System.out.print(arr[i]);
        }
    }
		
	
}
