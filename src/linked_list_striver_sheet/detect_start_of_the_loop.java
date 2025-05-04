package linked_list_striver_sheet;

import java.util.HashMap;

public class detect_start_of_the_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode detectCycle(ListNode head) {
    	ListNode slow=head;
    	ListNode fast=head;
    	while(fast!=null && fast.next!=null) {
    		slow=slow.next;
    		fast=fast.next.next;
    		if(slow==fast) {
        		slow=head;//loop exist then start searching loop start
        		while(slow!=fast) {
        			slow=slow.next;
        			fast=fast.next;
        		}
        		return slow;
    		}
    	}
    	return null;

    }
//    ➤ Time Complexity: O(n)
//    In the worst case, both the slow and fast pointers will traverse the list in linear time.
//
//    The first part (detecting cycle) takes O(n), and the second part (finding the start of the loop) also takes O(n).
//
//    But combined, it is O(n).
//
//    ➤ Space Complexity: O(1)
//    It only uses two pointers, regardless of the size of the list.
    public ListNode hasCycle2(ListNode head) {
		HashMap<ListNode,Integer> nodeMap=new HashMap<>();//to store nodes
		//that are visited
		ListNode temp=head;
		while(temp!=null) {
			if(nodeMap.containsKey(temp)) {
				return temp;
			}else {
				nodeMap.put(temp, 1);
			}
			temp=temp.next;
		}
		return null;

	}
//    ➤ Time Complexity: O(n)
//    In the worst case, you traverse each node once, doing constant-time operations (checking and putting in HashMap).
//
//    ➤ Space Complexity: O(n)
//    You store each visited node in a HashMap, so space usage grows linearly with the number of nodes.

}
