package linked_list_striver_sheet;

import linked_list_striver_sheet.reverse_of__singly_linked_list.ListNode;

public class merge_two_sorted_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    	 ListNode temp=new ListNode(0);//actual list to store result
     	ListNode dummy=temp; //dummy is used as pointer
     	while(list1!=null && list2!=null) {
     		if(list1.val<=list2.val) {
     			dummy.next=list1;
     			list1=list1.next;
     		}else {
     			dummy.next=list2;
     			list2=list2.next;
     		}
     		dummy=dummy.next;
     	}
     	if(list1!=null) {
     		dummy.next=list1;
     		
     	}
     	if(list2!=null) {
     		dummy.next=list2;//entire copy list2
     	}
     	return temp.next;//as value of both list will be added after comparison
         
    }
//    Metric	Complexity
//    Time Complexity	O(n + m)
//    Space Complexity	O(1)
    
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
    	ListNode temp=new ListNode(0);
    	ListNode dummy=temp;
    	ListNode p1=list1;
    	ListNode p2 =list2;
    	while(p1!=null && p2!=null) {
    		if(p1.val<=p2.val) {
    			dummy.next=p1;
    			p1=p1.next;
    		}
    		else {
    			dummy.next=p2;
    			p2=p2.next;
    		}
    		dummy=dummy.next;
    	}
    	while(p1!=null) {
    		dummy.next=p1;
			p1=p1.next;
			dummy=dummy.next;
    	}
    	while(p2!=null) {
    		dummy.next=p2;
			p2=p2.next;
			dummy=dummy.next;
    	}
    	return temp.next;
    
    }
//    Time Complexity: O(n + m)
//
//    Space Complexity: O(1)
    public static class ListNode{
    	public int val;
    	public ListNode next;
    	ListNode(int val){
    		this.val=val;
    	}
    }
	
	

}
