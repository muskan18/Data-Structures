package november22;

import java.util.Scanner;

public class Maxelementgreater {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of array");
		
		int size_of_arr = sc.nextInt();
		
		int arr[] = new int[size_of_arr];
		
		System.out.println("Enter array elements");
		
		for(int i=0;i<size_of_arr;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Enter the max value ");
		
		int w = sc.nextInt();
		
		printcountmax(w,arr);
	
		sc.close();
	}
	
	static void printcountmax(int w,int ar[])
	{
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i;j<ar.length;j++)
			{
				int max=0;
				for(int m=i;m<=j;m++)
				{
					if(max<ar[m])
						max=ar[m];
				}
				if(max>w)
					count++;
			}
		}
		System.out.println(count);
	}
}
