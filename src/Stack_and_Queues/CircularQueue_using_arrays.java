package Stack_and_Queues;

public class CircularQueue_using_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//Circular queue is implemented to optimize the fixed size arrays
	//as it reuse the freeup space created by deletions
	//as front is moving forward in case of normal queue
	
	public class queue{
		int front=-1;//No element to pop and push
		int rear=-1;
		int currsize=0;//keep track of no of elements on current basis
		int maxsize=1000;//capacity of queue by default
		int[]data;
		public queue() {
			this.data=new int [maxsize];
		}
		
		public void push (int x) {
			//if the queue is full
			if(currsize==maxsize) {
				System.out.println("queue is full");
				return;
			}
			//as in push operation we have to first maintain rear pointer then
			//pushing the element
			//if initally queue is empty then
			if(rear==-1) {
				front=0;
				rear=0;
			}else {
				rear=(rear+1)%maxsize;//as rear should be incremented then add
			}
			data[rear]=x;
			currsize++;
		}
		
		public int pop() {
			//if queue is empty
			if(isEmpty()==true) {
				return -1;
			}
			int val=data[front];
			//then adjust the front pointer
			if(currsize==1) {//if only one element is there
				front=0;
				rear=0;
			}else {
				front=(front+1)%maxsize;
			}
			currsize--;
			return val;
				
	
		}
		public boolean isEmpty() {
			return front==-1;//as elements got deleted from front end only
		}
		
		public int peek() {
			//if queue is empty
			if(isEmpty()==true) {
				return -1;
			}
			return data[front];
		}
	}

}
