package november24;

import java.util.*;

public class prefixtopostfix 

{

	static boolean check(char x)

	{

		switch(x)

		{

			case '*':

			case '/':

			case '+':

			case '-':

				return true;

		}

		return false;

	}

	static String changing_expression(String s)

	{

		Stack<String> s1=new Stack<String>();

		int len=s.length();

		for(int i=len-1;i>=0;i--)

		{

			if(check(s.charAt(i)))

			{

				String a=s1.pop();

				String b=s1.pop();

				String z=a+b+s.charAt(i);

				s1.push(z);

			}

			else

			{

				s1.push(s.charAt(i)+"");

			}

		}

		return s1.pop();

	}

	public static void main(String args[])

	{

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the prefix expression");

		String s=sc.next();

		String s1=changing_expression(s);

		System.out.println("The postfix expression is ");

		System.out.println(s1);

	}

}