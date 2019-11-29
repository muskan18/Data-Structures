package november28;
import java.util.*;

class Node
{
	int key;

	Node left = null, right = null;

	
	Node(int key) {
	
		this.key = key;
	}
}

	public class leftview {
	
	public static void main(String[] args)
	{
		Node root = new Node(5);
		
		root.left = new Node(6);
		
		root.right = new Node(7);
		
		root.left.right = new Node(8);
		
		root.right.left = new Node(9);
		
		root.right.right = new Node(10);
		
		root.right.left.left = new Node(11);
		
		root.right.left.right = new Node(12);

		leftViewfun(root);
	
	}
	
	
	
	public static void leftViewfun(Node root)
	{
		if (root == null) {
	
			return ;
		}
		
		Queue<Node> queue = new ArrayDeque<>();

		queue.add(root);

		Node curr;

		while (!queue.isEmpty())
		{
			int size = queue.size();
		
			int index = 0;

			while (index++ < size) {
				curr = queue.poll();

				if (index == 1) {
					System.out.print(curr.key + " ");
				}

				if (curr.left != null) {
					queue.add(curr.left);
				}

				if (curr.right != null) {
					queue.add(curr.right);
				}
			}
		}
	}


}