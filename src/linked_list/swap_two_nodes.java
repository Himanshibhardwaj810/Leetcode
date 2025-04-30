package linked_list;

import linked_list.middle_of_element.ListNode;
// 328,24,19,160,2181
public class swap_two_nodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//simple approach without swapping node but values

	public ListNode swapPairs(ListNode head) {
		ListNode temp = head;

		while (temp != null && temp.next != null) {
			// Swap values of adjacent nodes
			int var = temp.val;
			temp.val = temp.next.val;
			temp.next.val = var;

			// Move temp by two nodes to process the next pair
			temp = temp.next.next;
		}
		temp = head;
		return temp;
	}
	
	//swapping nodes using dummy prev
	 public ListNode swapPairs2(ListNode head) {
	       ListNode dummy=new ListNode(0);
	       dummy.next=head;
	       ListNode prev=dummy;
	       while(head!=null && head.next!=null){
	        ListNode first=head;
	        ListNode second=head.next;
	        
	        prev.next=second;
	        first.next=second.next;
	        second.next=first;

	        prev=first;
	        head=first.next;

	       }
	       return dummy.next;
	    }
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}
	}

}
