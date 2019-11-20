package november20;

import java.util.*;


class Node
{
	Node left,right;
	int key;
	
	
	public Node(int item)
	{
		key = item;
		left=right=null;
	}
	
}
public class checkbst {
	
	Node root;
	
	ArrayList<Integer> al = new ArrayList<Integer>();

	checkbst()

	{

		root=null;

	}

	
	checkbst(int key)

	{

		root=new Node(key);

	}
	
	void checkn()
	 {

		
		 ArrayList<Integer>al2 = new ArrayList<Integer>(al);
		 
		 Collections.sort(al2);
		 
		 if(al.equals(al2))
			 System.out.println("It is a BST");
		 
		 else
			 System.out.println("It is not a BST");
		 
		 
	 }
	 
	 void check1(Node root)
	 {
		 if(root!=null)
		 {
		  
			 check1(root.left);
		  
			 al.add(root.key);
		  
			 check1(root.right);
		 }
		 
	 }
	
	public static void main(String[] args) {
		
		checkbst t = new checkbst();
	
			
		t.root=new Node(4);
		
		t.root.left=new Node(2);
		
		//t.root.left=new Node(6);
		
		t.root.right=new Node(5);
		
		t.root.left.left=new Node(1);
		
		
		t.check1(t.root);
			
		t.checkn();
	}
	
}
