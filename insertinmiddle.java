package december9;

import java.util.Scanner;

public class insertinmiddle {

class Node{
		
		
		int data;
		
		Node next;
		
		Node(int data)
		{
			this.data = data;
			
			next = null;
		}
	}
	
	static Node root;
	
	void insert(int num)
	{
		if(root==null)
		{
			root = new Node(num);
			
			return;
			
		}
		
		Node tm =root;
		
		Node newnode = new Node(num);
		
		while(tm.next!=null)
		{
			tm=tm.next;
			
		}
		tm.next =newnode;
		newnode.next =null;
		
		
	}

	void insertm(int val)
	{
		Node nwn = new Node(val);
		
		if(root==null)
			return;
		
		
		Node tmpp = root;
		
		Node tmp = root;
		
		int c=0;
		
		while(tmpp!=null)
		{
			
			tmpp = tmpp.next;
			
			c=c+1;
		}
		
		
		
		int mid = c/2;
		if(c%2!=0)
			mid=mid+1;
		
		int v =0;
		while(v!=(mid-1))
		{
			v=v+1;
			
			tmp = tmp.next;
			
		}
		
		nwn.next = tmp.next;
	
		tmp.next = nwn;
		
		tmp=nwn;
		
		
	}
	
	
	
	void display(Node r)
	{
		Node temp =r;
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		
		
	}
	
	public static void main(String args[])
	{
		insertinmiddle obj = new insertinmiddle();
		
		Scanner sc= new Scanner(System.in);
		
	System.out.println("how many elments you want to enter ? ");
	
	int n = sc.nextInt();
	
	
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter elements ");
		obj.insert(sc.nextInt());
		
	}
	
	System.out.println("Enter the value you want to insert in middle");
	
	int midv = sc.nextInt();
	
	System.out.println("The list before adding in middle ");
	
	obj.display(obj.root);
	
	
	obj.insertm(midv);
	
	System.out.println("list after adding element in middle ! ");
	obj.display(obj.root);
	}
}
