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
		char ch[] = str.toCharArray();
	
		int q=0;

		int w=ch.length-1;

		while(q<w) {

			while(!((ch[q]>='A'&&ch[q]<='Z')||(ch[q]>='a'&&ch[q]<='z')) && q<w) 

			{

				q++;

			}

			while(!((ch[w]>='A'&&ch[w]<='Z')||(ch[w]>='a'&&ch[w]<='z')) && w>q) 

			{

				w--;

			}

			if(q<w) {

				char c=ch[q];

				ch[q]=ch[w];

				ch[w]=c;

				q++;

				w--;

			}

			

		}

		str=new String(ch);

		System.out.println("The reversed string is " + str);
		
		
            }
		
	
}
