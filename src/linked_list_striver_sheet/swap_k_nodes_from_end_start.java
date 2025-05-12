package linked_list_striver_sheet;
import java.util.*;
public class swap_k_nodes_from_end_start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head;
        for(int i=1;i<k;i++) {
        	first=first.next;
        }
        ListNode temp=first;
        ListNode second=head;
        while(temp.next!=null) {
        	temp=temp.next;
        	second=second.next;//till temp reaches end,second reaches n-k position
        }
//        then swap the values
        int val=first.val;
        first.val=second.val;
        second.val=val;
        return head;
       //complexity of this approach o(n).o(1) 		
    }
    public ListNode swapNodes2(ListNode head, int k) {
    	ArrayList<ListNode>list=new ArrayList<>();
    	ListNode current=head;
    	while(current!=null) {
    		list.add(current);
    		current=current.next;
    	}
    	int n=list.size();
    	ListNode first=list.get(k-1);//0th based indexing
    	ListNode second=list.get(n-k);
    	int val=first.val;
        first.val=second.val;
        second.val=val;
        return head;
    	
    }
    
    

}
