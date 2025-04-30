package linked_list;

import linked_list.swap_two_nodes.ListNode;

public class Merge_nodes_in_between_zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode mergeNodes(ListNode head) {
		ListNode list = new ListNode(0);//in order to access the head of new list
		ListNode curr = list;// to track new list
		ListNode temp = head.next;// to skip the first zero
		int sum = 0;
		while (temp != null) {
			if (temp.val != 0) {
				sum = sum + temp.val;
			} else {
				curr.next = new ListNode(sum);
				curr = curr.next;
				sum = 0;
			}
			temp = temp.next;

		}
		return list.next;
	}

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}
	}

}
