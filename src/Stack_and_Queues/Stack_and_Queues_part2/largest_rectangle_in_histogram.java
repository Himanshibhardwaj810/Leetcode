package Stack_and_Queues.Stack_and_Queues_part2;
import java.util.*;
public class largest_rectangle_in_histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//Brute force
//	we standing at current bar will check can we expand to left bar or 
//	right bar to maximize the area
    public int largestRectangleArea2(int[] heights) {
    	int maxarea=0;
        for(int i=0;i<heights.length;i++) {
        	int height=heights[i];
        	
        	//expand to left
        	int left=i;
        	while(left>=0 && heights[left]>=height) {
        		left--;
        	}
        	//expand to right
        	int right=i;
        	while(right<heights.length && heights[right]>=height) {
        		right++;
        	}
        	int width=right-left-1;//for 0 based indexing
        	int area=height*width;
        	
        	maxarea=Math.max(area, maxarea);
   	
        }
        return maxarea;
    }
    // brute force
    //Time Complexity: O(n^2)
    //Space Complexity: O(1)
    
    
    //Optimal approach
//    the intuition is that we pre calculate the nextsmaller and prevsmaller for
//    current bar so that calculation can be done in o(n)
    
    //function to get nextsmaller index
    public int[] nextSmaller(int[] heights) {
    	Stack<Integer>stack=new Stack<>();
    	int[]next=new int[heights.length];
    	for(int i=heights.length-1;i>=0;i--) {
    		while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]) {
    			stack.pop();
    		}
    		int nextsmaller;
    		if(stack.isEmpty()) {
    			nextsmaller=-1;
    		}else {
    			nextsmaller=stack.peek();
    		}
    		stack.push(i);
    		next[i]=nextsmaller;
    	}
    	return next;
    }
    
    //function to get prevsmaller index
    public int[] prevSmaller(int[] heights) {
    	Stack<Integer>stack=new Stack<>();
    	int[]prev=new int[heights.length];
    	for(int i=0;i<heights.length;i++) {
    		while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]) {
    			stack.pop();
    		}
    		int prevsmaller;
    		if(stack.isEmpty()) {
    			prevsmaller=-1;
    		}else {
    			prevsmaller=stack.peek();
    		}
    		stack.push(i);
    		prev[i]=prevsmaller;
    	}
    	return prev;
    }
    //main functiuon to compute largest rectangle
    public int largestRectangleArea(int[] heights) {
    	int[]prevSmaller=prevSmaller(heights);
    	int[]nextSmaller=nextSmaller(heights);
    	int maxarea=0;
    	int n=heights.length;
    	for(int i=0;i<heights.length;i++) {
    		if(nextSmaller[i]==-1) {
    			nextSmaller[i]=n;//because at max  the next smaller can be n only
    		}
    		int width=nextSmaller[i]-prevSmaller[i]-1;//next-prev-1
    		int height=heights[i];
    		int area=height*width;
    		maxarea=Math.max(area, maxarea);
    	}
    	return maxarea;
    }
//    1. getPrevSmaller(int[] heights)
//    Each element is pushed and popped once from the stack → O(n)
//
//    2. getNextSmaller(int[] heights)
//    Same logic → O(n)
//
//    3. Final area loop in largestRectangleArea()
//    Simple loop over n elements → O(n)
//
//    ✅ Total Time Complexity: O(n)
    
    
//    ✅ Total Space: O(n)
    

}
