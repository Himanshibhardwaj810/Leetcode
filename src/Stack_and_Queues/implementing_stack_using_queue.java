package Stack_and_Queues;
import java.util.*;
public class implementing_stack_using_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	class MyStack {
		Queue<Integer> queue;

	    public MyStack() {
	    	queue=new LinkedList<>();
	    }
	    
	    public void push(int x) {
	        //here we will first push the elements then reverse them in order to 
	    	//make them behave like stack 
	    	queue.add(x);
	    	int size=queue.size();
	    	for(int i=0;i<size-1;i++) {
	    		queue.add(queue.remove());
	    	}
	    	// Rotate the queue to make the last pushed element come to front
	    }
	    
	    public int pop() {
	        return queue.remove();
	    }
	    
	    public int top() {
	        return queue.peek();
	    }
	    
	    public boolean empty() {
	        return queue.isEmpty();
	    }
	}

}
