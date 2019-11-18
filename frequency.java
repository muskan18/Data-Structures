package nov18;

import java.util.*;

public class frequency {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elments");
		
		int no = sc.nextInt();
		
		int ar[] = new int[no];
		
		System.out.println("Enter elements");
		
		for(int i=0;i<no;i++)
		{
			
			ar[i] = sc.nextInt();
		}
		
		
		display_frequency(ar);
	}
	
	static void display_frequency(int arr[])
	{
		
		int count =1;
		int flag[] = new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			if(flag[i]==1)
				continue;
			
			for(int j=i+1;j<arr.length;j++)
			{
					if(arr[i]==arr[j])
					{
						count++;
						flag[j]=1;
					
					}
					
					
			}
			
			System.out.println(arr[i] + ": frequency =  " + count);
			count=1;
		}
		
		
	}
}
