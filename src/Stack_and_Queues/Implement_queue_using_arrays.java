package Stack_and_Queues;

public class Implement_queue_using_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class queue {
		int front=0;
		int rear=0;
		int[] data;

		public queue(int size) {
			this.data = new int[size];
		}
		public queue() {
			this.data = new int[1000];
		}

		public void push(int x) {//elements add at rear side
			if (rear == data.length) {
				System.out.println("Overflow");
			} else {
				data[rear] = x;
				rear++;
			}

		}

		public int pop() {
			if (isEmpty() == true) {
				System.out.println("Underflow");
				return -1;
			}
			int val = data[front];
			front++;
			return val;
		}

		public int peek() {
			if (isEmpty() == true) {
				return -1;
			}
			return data[front];

		}

		public boolean isEmpty() {
			return front==rear;
		}
	}
	//in queue there are two pointers and the elements lie between front and 
	//rear

}
