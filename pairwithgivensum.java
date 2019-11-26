package november26;

import java.util.*;

public class pairwithgivensum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of first array ! ");
		
		int s = sc.nextInt();
		
		System.out.println("Enter the elements ! ");
		
		int ar[] = new int[s];
		
		for(int i=0;i<s;i++)
		{
			
			ar[i]=sc.nextInt();
		}
		
		System.out.println("Enter the size of second array !");
		
		int s2 = sc.nextInt();
		
		int arr[] = new int[s2];
		
		System.out.println("Enter the elements !");
		
		for(int i=0;i<s2;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println("Enter the sum ");
		
		int sum = sc.nextInt();
		
		sc.close();
		
		pair_sum(ar,arr,sum);
	}
	
	static void pair_sum(int ar[] ,int arr[],int s)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if((ar[i]+arr[j])==s)
				{
					System.out.println(ar[i]+ ", " + arr[j]);
				}
			}
		}
		
	}
	
}
