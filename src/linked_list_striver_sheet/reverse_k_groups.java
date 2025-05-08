package linked_list_striver_sheet;

public class reverse_k_groups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;//to attach a duummy node in front
        
        //keep track of prrev group tail
        ListNode prevGroupTail=dummy;//after reversing
        ListNode curr=head;
        while(hasknodes(curr,k)) {
        	ListNode groupstart=curr;//to store the start of group
        	ListNode prev=null;
        	//reverse logic
        	for(int i=0;i<k;i++) {
        		ListNode next=curr.next;
        		curr.next=prev;
        		prev=curr;
        		curr=next;
        	}
        	prevGroupTail.next=prev;//end of previous group
        	groupstart.next=curr;//current reverse group ka end point to next group
        	prevGroupTail=groupstart;
        	
        	
        }
        return dummy.next;
        
    }
    
    public boolean hasknodes(ListNode curr,int k) {
    	ListNode temp=curr;
    	int count=0;
    	while(temp!=null && count<k) {
    		temp=temp.next;
    		count++;
    	}
    	return count==k;//return tre if k nodes exist
    }
//    Time Complexity = O(n) — where n is the total number of nodes in the list
//    Space Complexity = O(1) — constant extra space.

}
