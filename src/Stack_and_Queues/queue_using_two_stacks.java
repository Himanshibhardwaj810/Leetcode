package Stack_and_Queues;
import java.util.*;
public class queue_using_two_stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class MyQueue {
		Stack<Integer>stk1;
		Stack<Integer>stk2;
	    public MyQueue() {
	        stk1=new Stack<>();
	        stk2=new Stack<>();
	    }
	    
	    public void push(int x) {
	        stk1.push(x);
	        return;
	    }
	    
	    public int pop() {
	    	if(stk2.empty()) {
	    		while(!stk1.empty()) {
	    			stk2.push(stk1.pop());
	    		}
	    	}
	    	return stk2.pop();
	        
	    }
	    
	    public int peek() {
	    	if(stk2.empty()) {
	    		while(!stk1.empty()) {
	    			stk2.push(stk1.pop());
	    		}
	    	}//shift the stk1 element to stk2
	        return stk2.peek();
	    }
	    
	    public boolean empty() {
	        return stk1.empty()&& stk2.empty();
	    }
	}


}
