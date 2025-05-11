package linked_list_striver_sheet;

public class delet_middle_of_linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
		ListNode slow=head;
		ListNode fast=head;
		ListNode prev=null;//to keep track of prev of slow
		
		while(fast!=null && fast.next!=null) {
			prev=slow;
			slow=slow.next;
			fast=fast.next.next;
		}
		prev.next=slow.next;
		return head;
		
	}
//	The time complexity of the given code is O(n), and the space complexity is O(1).

}
