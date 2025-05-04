package linked_list_striver_sheet;

import java.util.*;

public class palindrome_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// optimal approach
//	Steps:
//		Find the middle of the list using slow and fast pointers.
//
//		Reverse the second half of the list.
//
//		Compare the first and second halves node by node.
//
//		(Optional) Restore the list to its original form.
	public boolean isPalindrome3(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode secondhalf = reverse(slow);
		ListNode temp1 = head;
		ListNode temp2 = secondhalf;
		while (temp1 != null && temp2 != null) {
			if (temp1.val != temp2.val) {
				return false;
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		return true;

	}

//	time complexity=o(n)
//	space complexity=o(1)

	public ListNode reverse(ListNode node) {
		ListNode prev = null;
		ListNode curr = node;
		ListNode next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;// head of reverse half

	}

	// brute force
	public boolean isPalindrome(ListNode head) {
		// use the dummy node to store the reversal of linked list
		// 1->2->3->4->null
		ListNode dummy = null;
		ListNode original = head;// save the original head for comparison
		while (head != null) {// we'll add new node in front of dummy
			ListNode newNode = new ListNode(head.val);
			newNode.next = dummy;// 1->null then 2->1->null
			dummy = newNode;
			head = head.next;
		}
		// dummy will be the head of new node eg 4
		ListNode temp1 = original;
		ListNode temp2 = dummy;
		while (temp1 != null && temp2 != null) {
			if (temp1.val != temp2.val) {
				return false;
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		return true;

	}
//    Time Complexity: O(n)
//    One pass to reverse, one pass to compare.
//    Space Complexity: O(n)
//    Because you're creating a reversed copy using new nodes.

	// using stack
	public boolean isPalindrome2(ListNode head) {
		Stack<Integer> stk = new Stack<>();
		ListNode temp = head;
		while (temp != null) {
			stk.push(temp.val);
			temp = temp.next;
		}
		temp = head;
		while (temp != null) {
			if (temp.val != stk.pop()) {
				return false;
			}
			temp = temp.next;
		}
		return true;
	}
	// time complexity=o(n)
	// space complexity=o(n)

}
