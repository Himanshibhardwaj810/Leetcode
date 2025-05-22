package Stack_and_Queues.Stack_and_Queues_part2;
import java.util.*;
public class Next_Smaller_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] nextSmallerElement(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> NextSmallerMap = new HashMap<>();
		Stack<Integer> stack = new Stack<>();

		// As we have to track the next greater element from right side
		// so we track it from right side of nums2
		for (int i = nums2.length - 1; i >= 0; i--) {
			int current = nums2[i];
			 
			// Remove elements from stack that are less than or equal to current

			while (!stack.isEmpty() && stack.peek() >= current) {
				stack.pop();// as we have to store only greater element
			}
			// If stack is empty, no next greater
			int nextsmaller;
			if (stack.isEmpty()) {
				nextsmaller = -1;
			}else {
				nextsmaller=stack.peek();
			}
			
			NextSmallerMap.put(current, nextsmaller);
			stack.push(current);
		}
		
		int[]res=new int[nums1.length];
		for(int i=0;i<nums1.length;i++) {
			res[i]=NextSmallerMap.get(nums1[i]);
		}
		return res;
	}

}
