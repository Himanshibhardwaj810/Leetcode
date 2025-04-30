package linked_list;



public class remove_nth_node {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public ListNode removeNthFromEnd(ListNode head, int n) {
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
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}
	}

}
