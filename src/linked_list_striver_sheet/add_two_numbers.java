package linked_list_striver_sheet;



public class add_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Create first number: 342 (represented as 2 -> 4 -> 3)
	    ListNode l1 = new ListNode(2);
	    l1.next = new ListNode(4);
	    l1.next.next = new ListNode(3);

	    // Create second number: 465 (represented as 5 -> 6 -> 4)
	    ListNode l2 = new ListNode(5);
	    l2.next = new ListNode(6);
	    l2.next.next = new ListNode(4);

	    // Create object and call addTwoNumbers
	    add_two_numbers obj = new add_two_numbers();
	    ListNode result = obj.addTwoNumbers(l1, l2);

	    // Print the result linked list
	    System.out.print("Result: ");
	    while (result != null) {
	        System.out.print(result.val);
	        if (result.next != null) {
	            System.out.print(" -> ");
	        }
	        result = result.next;
	    }
	    System.out.println(); // for newline

	}
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	
    	ListNode dummy=new ListNode(0);
    	ListNode temp=dummy;
    	int sum=0;
    	int carry=0;
    	while(l1!=null || l2!=null || carry !=0) {
    		int a=0;
    		int b=0;
    		if(l1!=null) {
    			a=l1.val;
    			l1=l1.next;
    		}
    		if(l2!=null) {
    			b=l2.val;
    			l2=l2.next;
    		}
    		sum=a+b+carry;
    		
    		temp.next=new ListNode(sum%10);
    		carry=sum/10;
    		temp=temp.next;
    		
    	}
    	return dummy.next;
        
    }
//    Time Complexity: O(max(N, M))
//    You traverse both linked lists l1 and l2 once.
//
//    Each loop iteration processes one node from l1 and one from l2,
//    so the total number of iterations is proportional to the longer of the
//    two lists.
    
//    ✅ Space Complexity: O(max(N, M))
//    You create a new linked list to store the sum.
//
//    For each digit in the result, you allocate a new node.
//
//    The number of result nodes will be at most max(N, M) + 1 
//    (the extra 1 is for a possible carry at the end).
    
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}
	}

}
