package december6;

public class checkmirror {

	static class Node{
	
		int data;

		Node left,right;
		
		Node(int data)
		{
			this.data=data;
		}
	
	}
	
	static Node root;
	
	boolean checkmi(Node root)
	{
	
		return check(root,root);
	}
	
	boolean check(Node one ,Node two)
	{
		if(one==null&&two==null)
			return true;
	
		if(one!=null&&two!=null&&one.data==two.data)
		{
		
			return (check(one.left,two.right))&&(check(one.right,two.left));
		}
		return false;
	}
	
	public static void main(String args[])
	{
		checkmirror r=new checkmirror();
		
		r.root=new Node(1);
		
		r.root.left=new Node(2);
		
		r.root.right=new Node(2);
		
		r.root.left.left=new Node(3);
		
		r.root.left.right=new Node(4);
		
		r.root.right.left=new Node(4);
		
		r.root.right.right=new Node(3);
		
		System.out.println(r.checkmi(r.root));
	}



	
}
