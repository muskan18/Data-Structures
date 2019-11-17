package november17;

import java.util.*;

public class removeduplicate {

	Node head;
	
	static class Node
	{
		int data;
		
		Node next;
		
		Node(int d)
		{
			
			data = d;
			
			next = null;
			
		}
	}
	
	public void insertnode(int new_data)
	{
		Node new_node = new Node(new_data);
		
		if(head==null)
		{
			head = new Node(new_data);
			
			return;
			
		}
		
		new_node.next = null;
		Node last_node = head;
		
		
		while(last_node.next != null)
			last_node = last_node.next;
		
		last_node.next = new_node;
		return;
		
	}
	
	static void remove_duplicate(Node head)
	{
		
		Node temp=head;

		 while(temp!=null)

		 {

			 Node temp1=temp.next;

			 Node temp2=temp;

			 while(temp1!=null)
			 {
				 if(temp.data==temp1.data)
				 {
					 temp2.next=temp1.next;
				 }

				 else
				 {
					 temp2=temp2.next;
				 }
					 temp1=temp1.next;
			 }

			 temp=temp.next;

		 }
	}
	
	static void printmylist(Node node)
	{
		while(node!=null)
		{
			System.out.println(node.data + " ");
			
			node = node.next;
					
		}
		
	}
	
	
	public static void main(String[] args) {
		
		removeduplicate obj = new removeduplicate();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of element");
		
		int ele =sc.nextInt();
		
		for(int i=0;i<ele;i++) {
			
			System.out.println("Enter element");
			
			int n = sc.nextInt();
			
			obj.insertnode(n);
		}
		
		obj.remove_duplicate(obj.head);
		
		obj.printmylist(obj.head);
		
		
	}
	
	
}
