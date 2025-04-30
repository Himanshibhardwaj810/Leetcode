package linked_list;


public class even_odd_list_indices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
        return head; // Edge case: Empty list or single node
        }
        ListNode head1=head.next;
        ListNode odd=head;
        ListNode even=head1;
        while(even!=null && even.next!=null){
            odd.next=even.next;//for linking pointer to next odd
            odd=odd.next;//for moving to next node
            if(odd!=null){
                even.next=odd.next;
                even=even.next;
            }
        }
          odd.next = head1; // Attach even list after the odd list
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
