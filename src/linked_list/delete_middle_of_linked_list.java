package linked_list;


public class delete_middle_of_linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode deleteMiddle(ListNode head) {
		if (head == null || head.next == null) {
			return null;
		}
		ListNode slow = head;
		ListNode fast = head;
		ListNode prev = head;// to keep track of prev of slow if it is first
		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		prev.next = slow.next;

		return head;

	}

	static class ListNode {
		int value;
		ListNode next;

		ListNode(int value) {
			this.value = value;
		}
	}

}
