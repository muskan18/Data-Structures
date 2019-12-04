package december3;
import java.util.*;

class Queue 
{
	 Node front;

	 Node rear;

	static class Node
	{
		int data;
	
		Node next;
		
		Node(int d)
		{
			data=d;
		
			next=null;
		}
	}
	
	public  Queue enQueue(Queue q,int d)
	{
		if(q.front==null)
		{
			q.front=new Node(d);
			
			q.rear=q.front;
		}
		else
		{
			q.rear.next=new Node(d);
			
			q.rear=rear.next;
		}
		return q;
	}
	
	public Queue deque(Queue q)
	{
		if(q.front==null)
		{
			System.out.println("Queue is empty");
		}
		else if(q.front.next==null)
		{
			q.front=null;
			
			q.rear=null;
		}
		else
		{
		q.front=front.next;	
		}
		
		return q;
	}

	public static void display(Queue q)
	{
		Node n=q.front;
		while(n!=null)
		{
			System.out.print(n.data+" ");
		
			n=n.next;
		}
	}
}

public class stackwithqueue 
{
	Queue q1=new Queue();
	
	Queue q2=new Queue();
	
	public static stackwithqueue push(stackwithqueue s,int num)
	{
		s.q1=s.q1.enQueue(s.q1,num);
	
		s.q2.front=null;
		
		Queue.Node temp=s.q1.front;
		
		while(temp!=null)
		{
			int n=temp.data;
		
			temp=temp.next;
			
			s.q2.enQueue(s.q2, n);
		}
		
		temp=s.q2.front;
		
		Queue.Node prev=null;
		
		Queue.Node curr=temp.next;
		
		while(curr!=null)
		{
			temp.next=prev;
		
			prev=temp;
			
			temp=curr;
			
			curr=curr.next;
		}
		
		temp.next=prev;
		
		prev=temp;
		
		temp=curr;
		
		s.q2.front=prev;
		
		s.q2.rear=s.q1.front;

		return s;
	}
	
	public static stackwithqueue pop(stackwithqueue s)
	{
	    s.q2.deque(s.q2);
		
	    return s;
	}
	
	public static int peek(stackwithqueue s)
	{
		return s.q2.front.data;
	}
	
	public static void display(stackwithqueue s)
	{
		Queue.Node temp=s.q2.front;
		
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
		
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) 
	{
		stackwithqueue s=new stackwithqueue();
		
		System.out.println("Enter number of elements");
		
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		
		System.out.println("Enter elements");
        
		for(int i=0;i<n;i++)
        {
        
			int num=in.nextInt();
        
			push(s,num);
        
        }
          
		System.out.println("The elements in stack before removing any element !");
		
		display(s);
        
		System.out.println();
       
		pop(s);
        
        System.out.println("The elements of stack after removing the top most element");
                
        display(s);
                
        System.out.println();
        
        System.out.println("The element which is removed from top now ! ");
        
        System.out.println(s.peek(s));
	
	}
}