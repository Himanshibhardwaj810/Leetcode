package linked_list_striver_sheet;

public class Rotate_a_linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//optimal approach
//	Calculate the length of the list.
//	Connect the last node to the first node, converting it to a circular linked list.
//	Iterate to cut the link of the last node and start a node of k%length of the list rotated list.
	public ListNode rotateRight2(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
		ListNode temp=head;
		int length=1;//len=5
		while(temp.next!=null) {
			length++;
			temp=temp.next;
		}
		//5 last node
		temp.next=head;//1->2->3->4->5->1->2->3->4->5
		//lets find new head and tail
		k=k%length;//if kis greater than length// k=4 len=3
		int stepstotail=length-k;//k=3
		//temp=5
		ListNode newTail=temp;
		for(int i=stepstotail;i>=1;i--) {
			newTail=newTail.next;
		}
		//new tail=3
		ListNode newHead=newTail.next;
		newTail.next=null;
		return newHead;
		
	
	}
//	✅ Time Complexity: O(n)
//	Where n is the number of nodes in the linked list.
//	Breakdown:
//	Traverse the list to calculate length → O(n)
//	Connect last node to head (make circular) → O(1)
//	Move (n - k % n) steps to find new head → O(n) in worst case
//	Break the circle → O(1)
	
	
//	✅ Space Complexity: O(1)
	

	//Brute force
	//keeping the track of tail and tail.next=head for k times
    public ListNode rotateRight(ListNode head, int k) {
        for(int i=0;i<k;i++) {//1->2->3->4->5
        	ListNode temp=head;
        	while(temp.next.next!=null) {//4
        		temp=temp.next;
        	}
        	ListNode tail=temp.next;//5
        	temp.next=null;//as we are tracking temp//4 next=null
        	tail.next=head;
        	head=tail;
        }
        return head;
    }
    //test case ni pass hore

}
