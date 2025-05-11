package linked_list_striver_sheet;

public class odd_even_linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode oddEvenList(ListNode head) {
		ListNode even_head=head.next;
		ListNode odd=head;
		ListNode even=even_head;
		while(even!=null && even.next!=null) {
			odd.next=even.next;
			odd=odd.next;//link odd node to next odd and move forward 
			if(odd!=null) {
				even.next=odd.next;//link even node to next even and move forward
				even=even.next;
			}
		}
		even.next=even_head;
		return head;
	}
	

}
