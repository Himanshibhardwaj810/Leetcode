package linked_list_striver_sheet;

public class reverse_of__singly_linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		printList(head);
		ListNode head2=reverseList(head);
		System.out.println();
		printList(head2);
		
		

	}
    public static ListNode reverseList(ListNode head) {
    	ListNode prev=null;
    	ListNode curr=head;
    	ListNode next=null;
    	while(curr!=null) {
    		next=curr.next;//setting the next pointer
    		curr.next=prev;
    		prev=curr;
    		curr=next;
    	}
    	//at last tail become head and the prev become tail as se
    	//sequence is Next curr prev
    	return prev;
    	//returning head;
    	//tail=head;
    	//head=prev;
        
   
    }
 
//    Time Complexity	O(n)
//    Space Complexity	O(1) nodes are created regardless of their size
    //display list
    public static void printList(ListNode head) {
    	ListNode temp=head;
    	while(temp!=null) {
    		System.out.print(temp.val+" ");
    		temp=temp.next;
    	}
    	
    }
    
    public static class ListNode{
    	public int val;
    	public ListNode next;
    	ListNode(int val){
    		this.val=val;
    	}
    	

    }

}
