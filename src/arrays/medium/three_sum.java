package arrays.medium;

import java.util.*;

public class three_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 0,1,1 };
		System.out.println(threeSum(nums));

	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;//it will skip the curent iteration
			}
			System.out.println(i);
			int left = i + 1;
			int right = nums.length - 1;
			System.out.println(left);
			System.out.println(right);
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == 0) {
					list.add(Arrays.asList(nums[i], nums[left], nums[right]));
					System.out.println(sum);
					System.out.println(left);
					System.out.println(right);

					while (left < right && nums[left] == nums[left + 1]) {
						left++;
					}
					while (left < right && nums[right] == nums[right - 1]) {
						right--;
					}
					System.out.println(left);
					System.out.println(right);
					left++;
					right--;
					System.out.println(left);
					System.out.println(right);
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				}
				System.out.println(left);
				System.out.println(right);
				System.out.println(list);
			}
		}
		return list;
	}

}
