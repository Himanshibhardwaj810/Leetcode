package Stack_and_Queues.Stack_and_Queues_part2;
import java.util.*;
public class Stock_span_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//as in this ques we have to track the previous price and then update the
	//span so we use stack here of int[] array of 2 elements of [price,span]
	class StockSpanner {
		Stack<int[]>stack;//stack of int[] of 2 elements

	    public StockSpanner() {
	        stack=new Stack<>();
	    }
	    //stack se pop islie krrhe h kunki hme consecutive less days chahiye
	    //agr days k prices chote h to direct add honge span m or pop hojenge ku
	    //kunki vo add hogye h or if again chota element ata h to vo again add hojega span 1 k stah
	    public int next(int price) {
	        int span=1;//as the price of current day is also added in consecutve days
	        while(!stack.isEmpty() && stack.peek()[0]<= price) {
	        	span=span+stack.pop()[1];
	        }
	        stack.push(new int[] {price,span});
	        return span;
	    }
	    //stack.peek()[0] isme stack m int array k 0th index means price ko
	    //compare kia gya h
	    
	    //stack.pop()[1]  ye int[] k 1th index span ko refer krha h 	    
	}
//	Stack me sirf wohi elements rakhte hain jo:
//
//		Ab tak ke sabse bade prices hain
//
//		Future me kisi aur price ka span calculate karne me kaam aa sakte hain
	
//	time Complexity=0(n);
//	 Space Complexity: O(n)
	
	//brute force
	public int[] calculateSpan(int[] prices) {
	    int n = prices.length;
	    int[] span = new int[n];

	    for (int i = 0; i < n; i++) {
	        int count = 1;
	        for (int j = i - 1; j >= 0; j--) {
	            if (prices[j] <= prices[i]) {
	                count++;
	            } else {
	                break;
	            }
	        }
	        span[i] = count;
	    }

	    return span;
	}
//	time Complexity=0(n2);
//	 Space Complexity: O(n)


}
