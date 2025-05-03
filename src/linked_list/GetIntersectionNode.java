package linked_list;
import java.util.*;


public class GetIntersectionNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		List<ListNode> list = new LinkedList<>();
		ListNode temp1 = headA;
		while (temp1 != null) {
			list.add(temp1);// if 1st node is intersection node and temp store current reference node
			temp1 = temp1.next;
		}
		ListNode temp2 = headB;
		while (temp2 != null) {
			if (list.contains(temp2)) {
				return temp2;
			}
			temp2 = temp2.next;
		}

		return null;
	}
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}
	}
	


}
