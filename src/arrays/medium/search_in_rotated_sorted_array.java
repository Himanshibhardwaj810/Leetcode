package arrays.medium;

public class search_in_rotated_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int search(int[] nums, int target) {
		int low = 0, high = nums.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (nums[mid] == target)
				return mid;

			// Left half is sorted
			if (nums[low] <= nums[mid]) {
				if (nums[low] <= target && target < nums[mid])
					high = mid - 1;
				else
					low = mid + 1;
			}
			// Right half is sorted
			else {
				if (nums[mid] < target && target <= nums[high])
					low = mid + 1;//as nums[mid]==target is already compared rhats
				//why we don't include equal to on right part or where target is compared with mid
				else
					high = mid - 1;
			}
		}

		return -1;
	}

}
