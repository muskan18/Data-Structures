package november30;

import java.util.*;

public class checkpallindromelist {

	Node head;

	Node left;

	class Node {

		int data;

		Node next;

		Node(int d) {

			data = d;

			next = null;
		}
	}

	boolean check(Node right) {

		left = head;

		if (right == null)
			return true;

		boolean b = check(right.next);
		if (b == false)
			return false;

		boolean c = (left.data == right.data);

		left = left.next;

		return c;

	}

	void insert(int item) {
		
		if (head == null)
			head = new Node(item);
		
		Node temp = head;
		
		while (temp.next != null)
			temp = temp.next;

		temp.next = new Node(item);
	}

	public static void main(String args[]) {
		
		checkpallindromelist list = new checkpallindromelist();
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of list: ");
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
		
			list.insert(sc.nextInt());
		}
		
		list.check(list.head);
		
		if (list.check(list.head) != false)
			System.out.print("Pallindrome");
		else
			System.out.print("Not a Pallindrome");
	}
}
