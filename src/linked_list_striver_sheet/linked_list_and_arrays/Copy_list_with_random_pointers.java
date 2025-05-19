package linked_list_striver_sheet.linked_list_and_arrays;

public class Copy_list_with_random_pointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//This approach includes building new nodes between existing nodes and
	//attaching them with the nodes and then setting the random pointers
	//of copied nodes and then separating original and copied list

	public Node copyRandomList(Node head) {
		//creating new nodes and inserting them between original nodes
		Node temp=head;
		while(temp!=null) {
			Node copy=new Node(temp.val);
			copy.next=temp.next;
			temp.next=copy;
			temp=copy.next;//as copy=temp.next
		}
		
		//set random pointers of copied nodes
		temp=head;
		while(temp!=null) {
			if(temp.random!=null) {
				temp.next.random=temp.random.next;
			}
			temp=temp.next.next;//here temp.next.random is the copy node
			//and temp.rando,.next is original node
		}
		
		//separate the two lists
		Node copiedlist=new Node(0);
		Node dummy=copiedlist;//pointer to traverse copied list
		temp=head;
		while(temp!=null) {
			dummy.next=temp.next;
			temp.next=temp.next.next;//restoring riginal temp's nexs pointer
			temp=temp.next;//moving pointers
			dummy=dummy.next;
		}
		return copiedlist.next;

	}
//	✅ Time Complexity: O(n)
//	Pass 1 (Insert copy nodes): Traverses the entire list once → O(n)
//	Pass 2 (Set random pointers): Another single traversal → O(n)
//	Pass 3 (Separate the lists): Another single traversal → O(n)
//
//	Total = O(n) + O(n) + O(n) = O(n)
//	(Where n is the number of nodes in the original list.)
	
//	✅ Space Complexity: O(1) (constant auxiliary space)

	static class Node {
		int val;
		Node next;
		Node random;

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.random = null;
		}

	}
}
