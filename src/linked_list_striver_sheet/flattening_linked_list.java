package linked_list_striver_sheet;
import java.util.*;
public class flattening_linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//Brute force
	//take an array and add nodes into linked list and then sort
	public ListNode flattenLinkedList(ListNode head) {
		ArrayList<Integer> list=new ArrayList<>();
		ListNode temp=head;
		while(temp!=null) {
			ListNode child=temp;
			while(child!=null) {
				list.add(child.val);
				child=child.child;
			}
			temp=temp.next;
		}
		
		Collections.sort(list);
		ListNode dummy=new ListNode(0);
		ListNode temp2=dummy;
		for(int i=0;i<list.size();i++) {
			temp2.child=new ListNode(list.get(i));
			temp2=temp2.child;
		}
		return dummy.child;//as  only child pointer is traversed
		
//		👉 Total Space Complexity = O(n)
//		👉 Total Time Complexity = O(n log n)
		
    }
	
	//optimal approach
	public ListNode flattenLinkedList2(ListNode head) {
		if(head==null || head.next==null) {
			return head;
		}
	      // Recursively flatten the next part
		ListNode mergedHead=flattenLinkedList2(head.next);
		// Merge current head’s child list with already flattened merged next list
		return merge(head,mergedHead);
	}
	
	//function to merge two linked list  using 'child' pointers
	public ListNode merge(ListNode L1,ListNode L2) {
		ListNode dummy=new ListNode(0);
		ListNode res=dummy;
		while(L1!=null && L2!=null) {
			if(L1.val<=L2.val) {
				res.child=L1;
				res=L1;
				L1=L1.child;
			}else {
				res.child=L2;
				res=L2;
				L2=L2.child;
			}
		}
		if(L1!=null) {
			res.child=L1;
		}
		if(L2!=null){
			res.child=L2;
		}
		return dummy.child;
//		👉 Time Complexity = O(n log k)
//	 // Time Complexity: O(n log k)
	    //      - n = total number of nodes in the entire structure
	    //      - k = number of top-level linked lists (nodes connected via 'next')
	    //      - At each level, two sorted lists are merged (merge takes O(n) over all)
	    //      - log k levels of merging (divide and conquer style like merge sort)
//		Space Complexity = O(k) (due to recursion stack)
	}
	
	
	class ListNode {
	    int val;
	    ListNode next;
	    ListNode child;

	    ListNode() {
	        val = 0;
	        next = null;
	        child = null;
	    }

	    ListNode(int data1) {
	        val = data1;
	        next = null;
	        child = null;
	    }

	    ListNode(int data1, ListNode next1, ListNode next2) {
	        val = data1;
	        next = next1;
	        child = next2;
	    }
	}

}
