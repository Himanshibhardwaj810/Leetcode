package Stack_and_Queues.Stack_and_Queues_part2;

import java.util.*;

public class minStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//using single stack
//	minStack holds actual values + backups of previous min values.
	//Jab bhi new min aata hai, usse pehle old min ko stack me store karte hain.
	class MinStack {
		Stack<Integer>minStack;
		int min=Integer.MAX_VALUE;//to track min

	    public MinStack() {
	        minStack=new Stack<>();
	    }
	    
	    public void push(int val) {
//	    	When a new value is less than or equal to the current minimum, you:
//	    		Save the old minimum before updating.
//	    		Then push the value.
	    	if(val<=min) {
	    		minStack.push(min);
	    		min=val;//to track minimum
	    	}
            minStack.push(val);
	        
	    }
	    
	    public void pop() {
	    	int removed=minStack.pop();
//	    	If the popped value was the current minimum, 
//	    	pop again to restore the old minimum.if minimum get popped
	    	//in order to maintain minimum
	    	if(removed==min) {
	    		min=minStack.pop();
	    	}
	        
	    }
	    
	    public int top() {
	    	return minStack.peek();
	        
	    }
	    
	    public int getMin() {
	        return min;
	    }
	} 
//	Jab removed == min, iska matlab tumne minimum value ko stack se nikaala hai.
//
//			Ab tumhe uska purana min wapas laana hai, jo tumne push karte waqt store kiya tha.
//
//			Isiliye dobara pop() karna padta hai.

	/*
	 * Logic: Push old min before new min. Restore it on pop.
	 * 
	 * Complexity:
	 * 
	 * ⏱️ push(), pop(), top(), getMin() → O(1)
	 * 
	 * 🧠 Space → O(n)
	 */
	// using two stack
//	stack: to store all elements.
//	minStack: to store the current min after each push.
	class MinStack2 {
		Stack<Integer> stack;
		Stack<Integer> minStack;

		public MinStack2() {
			minStack = new Stack<>();
			stack = new Stack<>();
		}

		public void push(int val) {
			stack.push(val); // Always push into main stack
			// Push to minStack if it's empty or new val is <= current min
			if (minStack.isEmpty() || val <= minStack.peek()) {
				minStack.push(val);
			}

		}

		public void pop() {
			int removed = stack.pop();
//	    	If the removed value is the current minimum, we must remove
//	    	it from minStack too
			if (removed == minStack.peek()) {
				minStack.pop();// if the removed element is the current minimum
			}

		}

		public int top() {
			return stack.peek();// as stack maintain only minimum so far

		}

		public int getMin() {
			return minStack.peek();
		}
	}
//	Metric	Value
//	Time (all ops)	O(1)
//	Space (worst)	O(n)
}
