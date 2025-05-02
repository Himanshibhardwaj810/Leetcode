package linked_list_striver_sheet;



public class remove_nth_node {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	//two pointer approach
	 public ListNode removeNthFromEnd(ListNode head, int n) {
		 ListNode dummy=new ListNode(0);//it is created as when n==len of list then fast.next
		 //will through null pointer exception
		 dummy.next=head;
		 ListNode slow=dummy;
		 ListNode fast=dummy;
		 for(int i=0;i<=n;i++) {//i.e =n ,move fast n+1 step ahead beacuse 
			 //We want slow to stop one node before the node we want to delete.
			 fast=fast.next;
		 }
		 while(fast!=null) {
			 slow=slow.next;
			 fast=fast.next;
		 }
		 slow.next=slow.next.next;
		 return dummy.next;
	 }
	// If you're removing the first node (like when n == length of list), 
	 //slow.next = slow.next.next; won’t work properly since slow will never reach the node before head.
	
	 public ListNode removeNthFromEnd2(ListNode head, int n) {
	        int length=0;
	        ListNode temp=head;
	        while(temp!=null){
	            length++;
	            temp=temp.next;
	        }
	        // Step 2: Edge case - Removing the first node
	        if (length == n) {
	            return head.next;
	        }
	        temp=head;
	        for(int i=1;i<length-n;i++){
	            temp=temp.next;
	        }
	        if(temp.next!=null){
	            temp.next=temp.next.next;
	        }
	        
	      return head;
	    }
//	 Method	               Time Complexity	Space Complexity
//	 Two-pointer (optimal)	  O(n)       	O(1)
//	 Length-counting method 	O(n)	    O(1)
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}
	}
	//: Both are linear-time and constant-space solutions. The two-pointer
	//method is often preferred in interviews because it's a single pass, 
	//while the length-counting one takes two passes.

}
