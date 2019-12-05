package december4;
import java.util.*;

class Stack 
{
    Node top;
    
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
    
    public static Stack push(Stack s,int data)
    {
   	
    	Node newNode = new Node(data);
    	
    	newNode.next=null;
    	
    	if(newNode==null)
    	{
    		System.out.println("stack overflow");
    	}
    	if(s.top==null)
    	{
    		s.top=newNode;
    	}
    	else
    	{
    		newNode.next=s.top;
    	
    		s.top=newNode;
    	}
    	
    	return s;
    }
    
    public static Stack pop(Stack s)
    {
    	if(s.top==null)
    	{
    		System.out.println("Stack Undeflow");
    	
    		return s;
    	}
    	else
    	{
    	Node n=s.top.next;
        
    	s.top=n;
    	
    	return s;
    	}
    }

    public static void display(Stack s)
    {
    	if(s.top==null)
    		System.out.println("Stack is Empty");
    	
    	else
    	{
    	Node first=s.top;
    	
    	while(first!=null)
    	{
    		System.out.print(first.data+" ");
    	
    		first=first.next;
    	}
    	}
    	
    	System.out.println("\n");
    }
    
    public static int peek(Stack s)
    {
    	if(s.top==null)
    	 return -1;
    	
    	else
    	 return s.top.data;
    }
}

public class queuewithstack 
{
    Stack s1=new Stack();
   
    Stack s2=new Stack();
    
    public static queuewithstack enQueue(queuewithstack q,int num)
    {
    	q.s1.push(q.s1,num);
    
    	q.s2.top=null;
    	
    	Stack.Node temp=q.s1.top;
    	
    	while(temp!=null)
    	{
    		q.s2.push(q.s2,temp.data);
    	
    		temp=temp.next;
    	}
    	return q;
    }
    
    public static queuewithstack deQueue(queuewithstack q)
    {
    	q.s2.pop(q.s2);
    	
    	return q;
    }
    
    public static void display(queuewithstack q)
    {
    	Stack.Node temp=q.s2.top;
    	
    	while(temp!=null)
    	{
    		System.out.print(temp.data+" ");
    	
    		temp=temp.next;
    	}
    }
    
	public static void main(String[] args) 
	{
		queuewithstack q=new queuewithstack();
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		
		int n=in.nextInt();
        
		System.out.println("Enter elements");
        
		for(int i=0;i<n;i++)
        {
        
			int num=in.nextInt();
        	
			q=enQueue(q,num);
    
        }
        
		System.out.println("Elements are : ");
		
		display(q);
        
		System.out.println();
        
		deQueue(q);
        
		System.out.println("Queue after removing the first element ");
		
		display(q);
	}

	
	

}


