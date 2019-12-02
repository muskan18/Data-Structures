package december1;
import java.util.*;

public class chocolate {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the size of array:");
	
	int n=sc.nextInt();
	
	int arr[]=new int[n];
	
	System.out.println("Enter the elements:");
	
	for(int i=0;i<n;i++) {
	
		arr[i]=sc.nextInt();
	}
	
	System.out.println("Enter the number of students:");
	
	int m=sc.nextInt();
	
	sc.close();
	
	difference(arr,m);
	
}
	
	
	static void difference(int ar[],int m)
	{
		
		int n = ar.length;
		
		if(ar.length==0|| m==0)
			System.out.print("0");
		
		int diff=Integer.MAX_VALUE;
		
		Arrays.sort(ar);
		
		for(int i=0;i<n-m+1;i++) {
		
			for(int j=i+m-1;j<n;j++) {
			
				if(ar[j]-ar[i]<diff)
					diff=ar[j]-ar[i];
				
			}
		
		}
	
		
		System.out.println("Minimum difference is: "+diff);
		
	}
	
	
	
	
	
	
	
	
}
