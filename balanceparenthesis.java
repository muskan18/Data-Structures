package november15;

import java.util.*;

public class balanceparenthesis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ! ");
		
		String st = sc.nextLine();
		
		checkbp(st);
	}
	
	static void checkbp(String st)
	{

		int flag=0;
		
		char ch[] = st.toCharArray();
		
		int len = ch.length;
		
		Stack<Character> stc = new Stack<Character>();

		for(int i=0;i<len;i++)
		{
			if(ch[i]=='{' || ch[i]=='('||ch[i]=='[' )
			{
				stc.push(ch[i]);
				
				flag=1;
			}
			if (!stc.empty()) {
		        if (ch[i] == '}') {
		            if (stc.peek() == '{')
		            
		            {
		                stc.pop();
		                continue;
		            }
		            else
		                break;
		        }
		        if (ch[i] == ']') {
		            if (stc.peek() == '[') {
		                stc.pop();
		                continue;
		            }
		            else
		                break;
		        }
		        if (ch[i] == ')') {
		            if (stc.peek() == '(') {
		                stc.pop();
		                continue;
		            }
		            else
		                break;
		        }
		    }
		    else {
		        break;
		    }
		}

		if ((stc.empty()) && (flag == 1))
		    System.out.println("Balanced");
		else
		   System.out.println("Not Balanced");
		}	
			
		
		    }
    
		
		
		

