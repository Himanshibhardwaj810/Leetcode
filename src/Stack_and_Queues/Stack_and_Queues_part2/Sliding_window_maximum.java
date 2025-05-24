package Stack_and_Queues.Stack_and_Queues_part2;
import java.util.*;
public class Sliding_window_maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//brute force
//	For each window of size k in the array:
//		Traverse all elements inside the window.
//		Find the maximum element in that window.
//		Store that maximum in the result array.
    public int[] maxSlidingWindow2(int[] nums, int k) {
    	int n=nums.length;
    	int[]res=new int[n-k+1];//the total windows formed
    	for(int i=0;i<n-k+1;i++) {
    		int max=nums[i];
    		for(int j=i+1;j<i+k;j++) {
    			if(nums[j]>max) {
    				max=nums[j];
    			}
    		}
    		res[i]=max;
    	}
    	return res;
    }
//    Approach	Time Complexity	Space Complexity
//    Brute Force	O(nk)	O(n-k+1)
//    Deque (Optimal)	O(n)	O(k) + O(n-k+1)
//    Why j < i + k?
//    		Here, i is the starting index of the current window.
//    		The window size is k, so the window covers indices:
//    		i to i + k - 1
//    		The inner loop starts from j = i + 1 and goes up to i + k - 1 inclusive.
//    		So the condition for the inner loop is j < i + k (because when j == i + k, it means we've gone one step beyond the window).
	
	
	
	//optimal
//	A deque (double-ended queue) lets us:
//		Pop from the front (oldest element) if it’s outside the window.
//		Pop from the back any element smaller than the new element, since
//		it can’t be the max as long as the new element is in the window.
//		Keep the elements in the deque in decreasing order, so the maximum is
//		always at the front.
    public int[] maxSlidingWindow(int[] nums, int k) {
    	int n=nums.length;
    	int[]res=new int[n-k+1];//the total windows formed
    	Deque<Integer>deque=new ArrayDeque<>();
    	
    	for(int i=0;i<nums.length;i++) {
    		//remove front if it is outside the window
    		if(!deque.isEmpty() && deque.peekFirst()==i-k) {
    			deque.pollFirst();//as i-k indicates index oitside the window
    		}
    		//remove smaller elements from queue than current 
    		while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]) {
    			deque.pollLast();
    		}
    		//add elements to the back as we can't have smaller elements
    		//before current as max element should be at front rest small can
    		//be placed after that
    		deque.offerLast(i);
    		
    		//if window size is full,add element to result
    		if(i>=k-1) {
    			res[i-k+1]=nums[deque.peekFirst()];
    		}
    		
    	}
    	return res;
//    	Complexity	Explanation
//    	Time	O(n) — Each element is pushed and popped at most once
//    	Space	O(k) for deque + O(n-k+1) for output ≈ O(n)
        
    }

}
