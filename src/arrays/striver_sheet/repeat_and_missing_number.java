package arrays.striver_sheet;

import java.util.*;

public class repeat_and_missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 1, 2, 5, 3 };
		System.out.println(Arrays.toString(missing_number3(nums)));

	}
//brute
	public static int[] missing_number(int[] nums) {
		HashSet<Integer> set = new HashSet<>();

		int duplicate = 0;
		int n = nums.length;
		int sum = n * (n + 1) / 2;
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				duplicate = nums[i];
			} else {
				set.add(nums[i]);
			}
			sum = sum - nums[i];
		}

		sum = sum + duplicate;
		return new int[] { duplicate, sum };
//			Time Complexity: O(n)
//			Space Complexity: O(n)

	}

	// optimized Approach
	public static int[] missing_number2(int[] nums) {
		int n = nums.length;
		int sum_n = n * (n + 1) / 2;
		int sum_sq_n = n * (n + 1) * (2 * n + 1) / 6;
		int sum_elements = 0;
		int sum_square_elements = 0;
		for (int i = 0; i < n; i++) {
			sum_elements = sum_elements + nums[i];
			sum_square_elements = sum_square_elements + nums[i] * nums[i];
		}
		int sum_sq_diff = sum_sq_n - sum_square_elements;
		int sum_diff = sum_n - sum_elements;
		int missing;
		int repeat;
		int repeat_plus_missing = sum_sq_diff / sum_diff;
		missing = (repeat_plus_missing + sum_diff) / 2;
		repeat = missing - sum_diff;

		return new int[] { missing, repeat };
//		Time Complexity: O(n)
//		Space Complexity: O(1)
		

	}
	//3rd way
	public static int[] missing_number3(int[] nums) {
		boolean[] present=new boolean[nums.length+1];//as index is 0 and we have to track elements
		int repeated=-1;
		int missing=-1;
		for(int i=0;i<nums.length;i++) {
			int num=nums[i];//the elements in nums array is used as index for boolean array

			if(present[num]==true) {
				repeated=num;//num is elemnt which is represented as index of boolean array
				present[num]=true;
			}
			else {
				present[num]=true;
			}
		}
		for(int i=0;i<present.length;i++) {
			if(present[i]==false) {
				missing=i;
			}
		}

		 return new int[]{repeated, missing};
		
	}
	

	// for 2d array

	public int[] findMissingAndRepeatedValues(int[][] grid) {
		HashSet<Integer> set = new HashSet<>();
		int duplicate = 0;

		// Flatten the 2D grid to calculate the total number of elements
		int n = grid.length * grid[0].length;
		int sum = n * (n + 1) / 2; // Expected sum of numbers from 1 to n

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				int value = grid[i][j];
				if (set.contains(value)) {
					duplicate = value; // Identify the duplicate
				} else {
					set.add(value); // Add the number to the set
				}
				sum -= value; // Subtract the current value from the expected sum
			}
		}

		// Add the duplicate back to find the missing number
		int missing = sum + duplicate;

		return new int[] { duplicate, missing };
	}

}
