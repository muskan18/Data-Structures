package november21;

import java.util.Scanner;

public class Max_elemnt_in_subarray {

	
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
		
		System.out.println("Enter the size of the window ");
		
		int window_size = sc.nextInt();
		
		printmaxelementinsubarray(window_size,arr);
	
		sc.close();
	}
	
	static void printmaxelementinsubarray(int k,int ar[])
	{
		for(int i=0;i<ar.length-k+1;i++)
		{
			
			int max_element=0;
			
			for(int j=i;j<i+k;j++)
			{
				
				if(ar[j]>max_element)
					max_element=ar[j];
			
			}
			
			
			System.out.print(max_element+", ");
		}
	}
}
