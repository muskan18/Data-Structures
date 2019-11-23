package november23;

import java.util.Scanner;

public class Reversedblyll {

	class Node{
		
		int data;
		
		Node prev;
		
		Node next;
		
		Node(int data)
		{
			this.data = data;
		}
	}
	
	Node head,tail = null;
	
	void addNode(int data)
	{
		
		Node newnode = new Node(data);
		
		if(head==null)
		{
			head = tail = newnode;
			
			head.prev = null;
			
			tail.next = null;
		}
		else {
			tail.next = newnode;
			
			newnode.prev = tail;
			
			tail = newnode;
			
			tail.next = null;
		}
	}
	
	void printmylist()
	{
		Node tmp = head;
		
		while(tmp!=null)
		{
			System.out.print(tmp.data+" ");
			
			tmp = tmp.next;
			
		}
		System.out.println();
		
	}
	
	
	void reverse()
	{
		
		Node current = head;
		
		Node temp = null;
		
		while(current!=null)
		{
			temp = current.next;
			
			current.next = current.prev;
			
			current.prev =temp;
			
			current = current.prev;
			
		}
		
		temp= head;
		
		head= tail;
		
		tail = temp;
	}
	
	public static void main(String[] args) {
		
		Reversedblyll obj = new Reversedblyll();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many nodes do you wanna enter ? ");
		
		int no_of_nodes = sc.nextInt();
		
		System.out.println("Enter the nodes ! ");
		
		for(int i=0;i<no_of_nodes;i++) {
			
			obj.addNode(sc.nextInt());
			
		}
		
		sc.close();
		
		System.out.println("Before reversing ! ");
		
		obj.printmylist();
	
		System.out.println();
		
		System.out.println("After reversing ! ");
		
		obj.reverse();
		
		obj.printmylist();
		
	}
	
	
	
}
