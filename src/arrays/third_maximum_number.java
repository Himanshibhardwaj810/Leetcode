package arrays;

import java.util.*;

public class third_maximum_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,1 };
		System.out.println(thirdMax(nums));

	}
	//we can use this as it tree set maintains unique and sorted elements
//        Set<Integer> uniqueNumbers = new TreeSet<>(); // Keeps unique and sorted numbers
	public static int thirdMax(int[] nums) {
		List<Integer> list = new ArrayList<>();
		Arrays.sort(nums);
		int max = nums[nums.length - 1];
		for (int i = 0; i < nums.length; i++) {
			if (!list.contains(nums[i])) {
				list.add(nums[i]);
			}
		}
		if(list.size()>=3) {
			return list.get(list.size()-3);
		}else {
			return max;
		}

	}

}
