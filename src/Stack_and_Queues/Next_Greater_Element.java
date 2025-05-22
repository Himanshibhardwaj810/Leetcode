package Stack_and_Queues;

import java.util.*;

public class Next_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//OPTIMAP APPROACH
	// Stack is used to track the next potential greater element
	// Map is used to store current element with their next element for
	// easy lookup
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> NextGreaterMap = new HashMap<>();
		Stack<Integer> stack = new Stack<>();

		// As we have to track the next greater element from right side
		// so we track it from right side of nums2
		for (int i = nums2.length - 1; i >= 0; i--) {
			int current = nums2[i];
			 
			// Remove elements from stack that are less than or equal to current

			while (!stack.isEmpty() && stack.peek() <= current) {
				stack.pop();// as we have to store only greater element
			}
			// If stack is empty, no next greater
			int nextgreater;
			if (stack.isEmpty()) {
				nextgreater = -1;
			}else {
				nextgreater=stack.peek();
			}
			
			NextGreaterMap.put(current, nextgreater);
			stack.push(current);
		}
		
		int[]res=new int[nums1.length];
		for(int i=0;i<nums1.length;i++) {
			res[i]=NextGreaterMap.get(nums1[i]);
		}
		return res;
	}
//	✅ Time and Space Complexity
//	Let:
//	n = nums1.length
//	m = nums2.length
//	⏱ Time Complexity: O(n + m)
//	Traversing nums2 once from right to left: O(m)
//	For each element, we may push and pop it from the stack only once.
//	Looking up each value for nums1 in the map: O(n)
//	➡ So total time = O(m + n)

//	A while (!stack.isEmpty()) inside a loop looks suspicious — 
	//but it's still linear if each element is pushed/popped at most once.
//	In our case:
//
//	We push each number once
//
//	We pop each number once
//	➡ This makes the total number of stack operations: O(m)
//	🧠 Space Complexity: O(m)
//	Stack stores at most m elements: O(m)
//
//	HashMap stores one entry per element of nums2: O(m)
	
	
	//brute force
	 public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
		 int[]ans=new int[nums1.length];
		 for(int i=0;i<nums1.length;i++) {
			 int num=nums1[i];
			 int indexinNums2=-1;
			// Step 1: Find index of nums1[i] in nums2
			 for(int j=0;j<nums2.length;j++) {
				 if(num==nums2[j]) {
					 indexinNums2=j;
					 break; 
				 }
			 }
			 // Find the next greater element to the right of that index
			 int nextGreater=-1;
			 for(int j=indexinNums2+1;j<nums2.length;j++) {
				 if(nums2[j]>num) {
					 nextGreater=nums2[j];
					 break;
				 }
			 }
			 // Step 3: Store the result
			 ans[i]=nextGreater;
		 }
		 return ans;
	 }
//	 ✅ What this does:
//		 Finds the element in nums2 that matches each element of nums1.
//
//		 Scans to the right in nums2 from that point.
//
//		 Picks the first number greater than the current one.
//
//		 Stores -1 if none is found.
	 
//	 Complexity Type	Value
//	 Time Complexity	O(n * m)
//	 Space Complexity	O(n)

}
