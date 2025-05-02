package linked_list_striver_sheet;

public class middle_of_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// using two pointer approach
	public ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
//	✔️ Time Complexity: O(n)
//	Each node is visited at most once.
//
//	✔️ Space Complexity: O(1)
//	Uses only two pointers: slow and fast.

	// 2nd approach using mid
	public ListNode middleNode2(ListNode head) {
		ListNode temp = head;
		int length = 0;
		while (temp != null) {
			length++;
			temp = temp.next;
		}
		temp = head;
		int mid = ((length) / 2) + 1;
		for (int i = 1; i < mid; i++) {
			temp = temp.next;
		}
		return temp;
	}
//	❌ Time Complexity: O(n)
//	Two passes through the list: one for length, one for locating the middle.
//
//	✔️ Space Complexity: O(1)
//	Uses only a few pointers and variables.
	static class ListNode {
		int value;
		ListNode next;

		ListNode(int value) {
			this.value = value;
		}
	}

}
