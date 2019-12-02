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
		
		for (int i = 0; i < n-1; i++) {
	    
			for (int j = 0; j < n-i-1; j++) {
	        
				if (ar[j] > ar[j+1])
	            {
	            
					int temp = ar[j];
	                
					ar[j] = ar[j+1];
	                
					ar[j+1] = temp;
	            }
	        }
		}
		
		int diff=ar[m-1]-ar[0];
		
		System.out.println("Minimum difference is: "+diff);
		
	}
	
	
	
	
	
	
	
	
}
