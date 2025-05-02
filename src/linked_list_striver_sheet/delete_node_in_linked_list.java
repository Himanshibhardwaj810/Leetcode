package linked_list_striver_sheet;

public class delete_node_in_linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);


        ListNode node = head.next.next;  // Node with value 3
        deleteNode(node);

        System.out.println("List After Deleting Node 3:");
        printList(head);

	}
	
    public static void deleteNode(ListNode node) {
    	//1->2->3->4
    	node.val=node.next.val;//copies the value of next node in current node 
    	//1->2->4->4
    	node.next=node.next.next;//skip the node to delete;
    }
    
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println(); // New line after printing the list
    }

    	//time complexity=o(1);
    //space complexity=o(1);
    
    	
        
    }
   class ListNode{
    	public int val;
    	public ListNode next;
    	ListNode(int val){
    		this.val=val;
    	}

}
