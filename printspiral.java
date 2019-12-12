package december10;

import java.util.*;

public class printspiral {

	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the number of rows ");
		
		int row = sc.nextInt();
		
		System.out.println("Enter the number of columns ");
		
		int col = sc.nextInt();
		
		int ar[][] = new int[row][col];
		
		System.out.println("Enter the elements");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				
				ar[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		spiralprint(ar,row,col);
		
	}
	
	
	static void spiralprint(int ar[][],int row,int col)
	{
		
		int k=0,l=0;
		
		while(k<row&&l<col)
		{
			for(int i=l;i<col;i++)
				System.out.print(ar[k][i]+" ");
			
			k++;
			
			for(int i=k;i<row;i++)
				System.out.print(ar[i][col-1]+" ");
			
			col--;
			if(k<row)
			{
				for(int i=col-1;i>=l;i--)
					System.out.print(ar[row-1][i]+" ");
				
				row--;
			}
			
			if(l<col)
			{
				for(int i=row-1;i>=k;i--)
					System.out.print(ar[i][l]+" ");
				
				l++;
			}
		}
		
		
		
	}
	
}
