package november19;

import java.util.*;

public class rotatelist {

	class Node
	{
		
		int data;
		
		Node next;
		
		Node(int data)
		{
			this.data = data;
			
		}
		
		
	}
	
	Node root;
	
	void insert(int d)
	{
		
		Node newnode = new Node(d);
		
		if(root==null)
		{
			root = newnode;
			return;
		}
		
		Node tmp = root;
		
		while(tmp.next!=null)
		{
			tmp = tmp.next;
			
		}
		tmp.next = newnode;
		
		newnode.next = null;
		
		
	}
	
	void display(Node head)
	{
		Node t = head;
		
		while(t!=null)
		{
			System.out.print(t.data+ " ");
			t=t.next;
		}
		System.out.println();
	}
	
	Node rotate(Node root,int n)
	{
		if(root==null)
			return null;
        
		Node cur=root;
        
		int len=1;
        
		while(len<n&&cur!=null){
        
			cur=cur.next;
            
			len++;
        }
        
		Node tmp =cur; 
		
		while(cur.next!=null){
        
		cur = cur.next;
		
		}
		
        cur.next=root;
        
        root = tmp.next;
        
        tmp.next= null;
        
		return root;
	}
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		rotatelist obj = new rotatelist();
		
		System.out.println("Enter the number of nodes ");
		
		int no = s.nextInt();
		
		System.out.println("Enter the data");
		
		for(int i=0;i<no;i++)
		{
			
			obj.insert(s.nextInt());
		}
		
		System.out.println("Enter the numberof times you want to rotate ");
		
		int rotation = s.nextInt();
		
		s.close();

		System.out.println("List before rotation ");
		
		obj.display(obj.root);
		
		System.out.println("List after rotation");
		
		Node k = obj.rotate(obj.root, rotation);
		
		obj.display(k);
		
	}
	
}
