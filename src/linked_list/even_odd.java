package linked_list;

public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(5);
		head.next = new Node(15);
		head.next.next = new Node(20);
		head.next.next.next = new Node(25);
		Node temp = head;
		int count_even = 0;
		int count_odd = 0;
		while (temp != null) {
			if (temp.value % 2 == 0) {
				count_even++;
			} else {
				count_odd++;
			}
			temp = temp.next;
		}
		System.out.println(count_even);
		System.out.println(count_odd);
		
		even_odd(head);

	}
	public static void even_odd(Node temp) {
		
//		Node temp=head;
		int count_even=0;
		int count_odd=0;
		while(temp!=null) {
			if(temp.value%2==0) {
				count_even++;
			}else {
				count_odd++;
			}
			temp=temp.next;
		}
		System.out.println(count_even);
		System.out.println(count_odd);
	}

	static class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}

	}

}
