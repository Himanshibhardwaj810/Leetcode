package Stack_and_Queues;

public class Implement_stack_using_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class ArrayStack {
		int[] data;
		int ptr = -1;

		public ArrayStack(int size) {
			this.data = new int[size];
		}
	    public ArrayStack() {
	        this.data = new int[1000];  // default size
	    }

		public void push(int x) {
	        if (ptr == data.length - 1) {
	            System.out.println("Stack Overflow");
	          //These are valid indices: 0 to n-1 (because arrays in Java are 0-indexed)
	            return;
	        }else {
				ptr++;
				data[ptr] = x;
	        }
			

		}

		public int pop() {
			if (isEmpty() == true) {
				return -1;
			}
			int val = data[ptr];
			ptr--;
			return val;

		}

		public int top() {
			if (isEmpty() == true) {
				return -1;
			}
			return data[ptr];

		}

		public boolean isEmpty() {
			return ptr==-1;//from which the ptr is initialized
		}
	}
//	First: Why ptr = -1?
//			This is a very standard way to indicate that the stack is empty.
//
//			👉 Why?
//			The stack is empty before we insert any elements.
//
//			So, no valid index is pointing to a value.
//
//			Arrays are 0-indexed, so:
//
//			First element goes at index 0
//
//			Second at 1, and so on
//
//			If we start with ptr = -1, then:
//
//			After first push(), we do ptr++ → ptr = 0
//
//			Then we place the element at data[0]

}
