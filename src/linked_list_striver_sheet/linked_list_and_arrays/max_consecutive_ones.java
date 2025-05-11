package linked_list_striver_sheet.linked_list_and_arrays;

public class max_consecutive_ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 0, 1, 1, 1 };
		System.out.println(findMaxConsecutiveOnes(nums));

	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int length = 0;
		int max_length = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				length++;
				max_length = Math.max(max_length, length);
			} else {
				length = 0;
			}
		}
		return max_length;
	}
//	Time Complexity: O(N) since the solution involves only a single pass.
//
//	Space Complexity: O(1) because no extra space is used.

}
