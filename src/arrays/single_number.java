package arrays;

import java.util.*;

public class single_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {  2,2, 1 };
		System.out.println(singleNumber(nums));
//		System.out.println(singleNumber1st(nums));
		System.out.println(hashsetmethod(nums));

	}

	// here we are using xor operator as xor yields 0 output if element is
	// same and for different output yield the element other than 0
	public static int singleNumber(int[] nums) {
		int k = 0;
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result = result ^ nums[i];
			System.out.println(result);
		}
		return result;
	}
	public static int hashsetmethod(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				set.remove(nums[i]);
			} else {
				set.add(nums[i]);
			}
		}
		for (int num : set) {
			return num;
		}
		return 0;

	}
	//brute firce approach
	public static int singleNumber1st(int[] nums) {
		int k = 0;
		for (int i = k + 1; i < nums.length; i++) {
			if (nums[k] == nums[i]) {
				i++;
				k++;
			}
		}
		return nums[k];
	}

	// arraylist


}
