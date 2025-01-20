package arrays.medium;

import java.util.Arrays;

public class three_sum_closest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,0 };
		System.out.println(threeSumClosest2(nums, -100));

	}//corect one

	public static int threeSumClosest2(int[] nums, int target) {
		Arrays.sort(nums);
		int resultsum = nums[0] + nums[1] + nums[2];
		System.out.println(resultsum);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length - 2; i++) {//as the sum is  of three numbers sonlast two are required
			//thats why nums.length-2
			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				System.out.println(sum);
				if (sum == target) {
					return sum;
				} else if (sum < target) {
					left++;//as we have to move closest we assume that the sum is too small than target
					//as since the array is sorted moving left pointer will increase the sum
				} else {
					right--;
				}
				System.out.println(sum);
				int diff = Math.abs(sum-target);
				System.out.println(diff);
				System.out.println(min);
				if (diff < min) {
					min = diff;
					resultsum = sum;
				}
				System.out.println(resultsum);

			}
		}
		return resultsum;

	}
//brute force
	public static int threeSumClosest(int[] nums, int target) {
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int diff;
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				sum = nums[i] + nums[j] + nums[j + 1];
				System.out.println(sum);
				if (nums.length == 3) {
					return sum;
				}
				if (sum == target) {
					return sum;
				} else if (sum > target || sum < target) {
					diff = Math.abs(target - sum);
					System.out.println(diff);
					if (diff < min) {
						min = diff;
						index = sum;
						System.out.println(index);
					}

				}
			}
		}

		return index;
	}

}
