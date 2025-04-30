package linked_list;

public class sum_of_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(15);
        head.next.next.next = new Node(20);
		Node temp=head;
		int sum=0;
		while(temp!=null) {
			sum=sum+temp.value;
			temp=temp.next;
			
		}
		System.out.println(sum);

	}
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
		
	}

}
