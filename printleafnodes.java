package december7;
import java.util.*;

public class printleafnodes {

	
	static class Node
	{
		int data;
		
		Node left,right;
		
		Node(int data)
		{
			this.data=data;
		
			left=right=null;
		}
	}
	
	static Node root;
	
	void insert(int data)
	{
	
		root=insertRec(root,data);
	}
	
	Node insertRec(Node root,int data)
	{
	
		Node tem=new Node(data);
		
		if(root==null)
		{
		
			root=tem;
			
			return root;
		}
		
		if(data<root.data)
		{
		
			root.left=insertRec(root.left,data);
		
		}
		
		else
		{
		
			root.right=insertRec(root.right,data);
		
		}
		
		return root;
	}
	
	void printinorder(Node root)
	{
		if(root!=null)
		{
			printinorder(root.left);
			
			System.out.print(root.data+" ");
			
			printinorder(root.right);
		}
	}
	
	void printLeafnode(Node root)
	{
		if(root==null)
			return;

		if(root.left==null&&root.right==null)
		{
		
			System.out.print(root.data+" ");
			
			return;
		
		}
		
		if(root.left!=null)
		{
		
			printLeafnode(root.left);
		
		}
		
		if(root.right!=null)
		{
		
			printLeafnode(root.right);
		
		}
	}
	
	public static void main(String args[])
	{
		printleafnodes obj=new printleafnodes();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of nodes ! ");
		
		int size=sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the node ! ");
			
			obj.insert(sc.nextInt());
		
		}
		obj.printinorder(obj.root);
		
		System.out.println();
		
		System.out.println("Leaf nodes are ");
		
		obj.printLeafnode(obj.root);
	}
	
	
}
