package arrays;

import java.util.*;

public class find_disappear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1 };
		System.out.println(findDisappearedNumbers2(nums));

	}

	// using hashset and list
	public static List<Integer> findDisappearedNumbers2(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		List<Integer> result = new ArrayList<>();
		for (int i = 1; i <= nums.length; i++) {
			if (!set.contains(i)) {
				result.add(i);
			}
		}
		System.out.println(result);
		return result;
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (!list.contains(nums[i])) {
				list.add(nums[i]);
			}
		}
		System.out.println(list);
		List<Integer> result = new ArrayList<>();
		for (int i = 1; i <= nums.length; i++) {
			if (!list.contains(i)) {
				result.add(i);
			}
		}
		System.out.println(result);
		return result;

	}

}
