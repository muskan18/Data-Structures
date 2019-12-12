package december11;

import java.util.*;

public class largestnumber {

public static void main(String args[])
{

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size of array");
	
	int si = sc.nextInt();
	
	int ar[] = new int[si];
	
	System.out.println("Enter the array elements ");
	
	for(int i=0;i<si;i++)
	{
		ar[i]= sc.nextInt();
	}
	
	sc.close();
	
	String str =printlargest(ar);
	
	System.out.println("The largest number that can be formed is : ");
	
	System.out.println(str);
	
}

static String printlargest(int ar[])
{
	
	String[] strs = new String[ar.length];
	
	for (int i=0; i<ar.length; i++) {
	
		strs[i] = String.valueOf(ar[i]);
	 
	}
	 
	 Arrays.sort(strs, new Comparator<String>(){
	
		 public int compare(String str1, String str2) {
	     
			 String s1 = str1 + str2;
	         
			 String s2 = str2 + str1;
	         
			 return s2.compareTo(s1);
	     }
	 });
	 
	 if (strs[0].equals("0")) {
	   
		 return "0";
	 
	 }
	 
	 StringBuilder sb = new StringBuilder(strs.length);
	 
	 for (String str : strs) {
	 
		 sb.append(str);
	 }
	 
	 return sb.toString();
	
}
	
	
}
	
	

