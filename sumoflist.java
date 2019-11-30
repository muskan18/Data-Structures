package november29;
	
	class Node{
		
		int val;
		 
		Node next;
		
	Node(int x)
	{
			val = x;
			next = null;
	}
	
	}
	class sumoflist{
	
		
		
		static Node h1,h2;
		
	public Node addTwoNumbers(Node l1, Node l2) 
	{
	
		int carry = 0;
		
	    Node cur1 = l1;
	
	    Node cur2 = l2;
	    
	    Node cur = cur1;
		
	    while(cur1 != null && cur2 != null){
	    
	    	cur = cur1;
	        
	    	int sum = cur1.val + cur2.val + carry;
	        
	    	cur1.val = sum % 10;
	        
	    	carry = sum / 10;
	        
	    	cur1 = cur1.next;
	        
	    	cur2 = cur2.next;
	    }
	    
	    if(cur1 == null && cur2 != null){
	    
	    	cur.next = cur2;
	        
	    	cur = cur.next;
	        
	    	cur1 = cur;
	    }
	    else if (cur1 != null && cur2 == null){
	    
	    	cur = cur1;
	    }
	    
	    while(cur1 != null)
	    {
	        
	    	cur = cur1;
	        
	        int sum = cur1.val + carry;
	        
	        cur1.val =  sum % 10;
	        
	        carry = sum / 10;
	        
	        cur1 = cur1.next;
	    }
		
	    if(carry!=0) cur.next = new Node(carry);
	    
	    return l1;   
	} 
	
	void printList(Node head) { 
  
		while (head != null) { 
        
			System.out.print(head.val + " "); 
            
			head = head.next; 
        } 
        System.out.println(""); 
    } 
  
	public static void main(String[] args) {
		
		sumoflist list = new sumoflist(); 
		  
        list.h1 = new Node(7); 
  
        list.h1.next = new Node(5); 
        
        list.h1.next.next = new Node(9); 
        
        list.h1.next.next.next = new Node(4); 
        
        list.h1.next.next.next.next = new Node(6); 
        
        System.out.print("First List is "); 
        
        list.printList(h1); 
        
        list.h2 = new Node(8); 
        
        list.h2.next = new Node(4); 
        
        System.out.print("Second List is "); 
        
        list.printList(h2); 
        
        Node rs = list.addTwoNumbers(h1, h2); 
        
        System.out.print("Sum is "); 
        
        list.printList(rs); 
		
	}
	
	}