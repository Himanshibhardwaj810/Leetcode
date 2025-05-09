package linked_list_striver_sheet;
import java.util.*;

import linked_list_striver_sheet.merge_two_sorted_list.ListNode;
public class get_intersection_node {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//optimal approach
//	take two pointers a and b if any of them get null start that pointer 
//	from the head of other list if intersetion node exist the a becomes equal to
//	b after atmost two passes
	public ListNode getIntersectionNodeoptimal(ListNode headA, ListNode headB) {
		if(headA==null || headB==null) {
			return null;
		}
		
		ListNode a=headA;
		ListNode b=headB;
		while(a!=b) {//till a not become equal to b
			if(a!=null) {
				a=a.next;
			}else {
				a=headB;
			}
			
			if(b!=null) {
				b=b.next;
			}else {
				b=headA;
			}
		}
		return a;//it can be null if intersection node doesn't exist or 
		//can be the intersection node
		
	}
//	✅ Time Complexity: O(m + n)
//	m is the length of headA's linked list.
//	n is the length of headB's linked list.
//	In the worst case, both pointers (a and b) traverse both lists entirely (first their own list, then the other list).
//	That’s a total of m + n steps.
	
//	✅ Space Complexity: O(1)
	
	
	//brute force
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode temp1=headA;
		
		while(temp1!=null) {
			ListNode temp2=headB;
			while(temp2!=null) {
				if(temp1.next==temp2.next) {
					return temp1;
				}
				temp2=temp2.next;
			}
			temp1=temp1.next;
		}
		return null;
	}
	
	//Hashing
	public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
		HashSet<ListNode>set=new HashSet<>();
		ListNode temp1=headA;
		ListNode temp2=headB;
		while(temp1!=null) {
			set.add(temp1);
			temp1=temp1.next;
		}
		while(temp2!=null) {
			if(set.contains(temp2)) {
				return temp2;
			}
			temp2=temp2.next;
		}
		return null;
		

	}
//	Approach	Time Complexity	Space Complexity
//	Brute Force	  O(m × n)	       O(1)
//	Hashing	      O(m + n)	       O(m)

    public static class ListNode{
    	public int val;
    	public ListNode next;
    	ListNode(int val){
    		this.val=val;
    	}
    }
}
