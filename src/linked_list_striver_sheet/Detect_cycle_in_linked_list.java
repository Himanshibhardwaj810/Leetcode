package linked_list_striver_sheet;
import java.util.*;
public class Detect_cycle_in_linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean hasCycle(ListNode head) {
		ListNode slow=head;
		ListNode fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;

	}
	//🔍 Time Complexity:
//	O(N)
//	In the worst case, the fast and slow pointers traverse the list once before meeting or reaching the end.
//
//	🔍 Space Complexity:
//	O(1)
//	No extra space is used — just two pointers.
	
	// 2nd approach using hashmap
	public boolean hasCycle2(ListNode head) {
		HashMap<ListNode,Integer> nodeMap=new HashMap<>();//to store nodes
		//that are visited
		ListNode temp=head;
		while(temp!=null) {
			if(nodeMap.containsKey(temp)) {
				return true;
			}else {
				nodeMap.put(temp, 1);
			}
			temp=temp.next;
		}
		return false;

	}
//	 Time Complexity:
//		 O(N)
//		 Each node is visited once, and HashMap operations (put, containsKey) are on average O(1).
//
//		 🔍 Space Complexity:
//		 O(N)
//		 You store every visited node in the HashMap.
}
