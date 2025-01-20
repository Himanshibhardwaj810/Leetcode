package arrays.striver_sheet;

import java.util.ArrayList;
import java.util.List;

public class count_valid_subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3, 2, 1, 4, 5};
		System.out.println(mergeSort(nums, 0, nums.length - 1));

	}

	public static int mergeSort(int arr[], int start, int end) {
		int count = 0;
		if (start >= end) {
			return 1;
		}
		
			int mid = start + (end - start) / 2;
			count = count + mergeSort(arr, start, mid);
			count = count + mergeSort(arr, mid + 1, end);
			count += merge(arr, start, mid, end);
		
	        System.out.println("Merged Array from " + start + " to " + end + ": "  + ", Count: " + count);
		return count;
	}

	public static int merge(int arr[], int start, int mid, int end) {
		int count = 0;
		List<Integer> temp = new ArrayList<>();
		int low = start;
		int high = mid + 1;
		while (low <= mid && high <= end) {
			if (arr[low] <= arr[high]) {
				count +=(end - high + 1);// as all teh elemnts to the left of right subarray are alse greater
													// than the left mist element
				temp.add(arr[low]);
				low++;

			} else {

				temp.add(arr[high]);
				high++;
			}
		}
		while (low <= mid) {
			temp.add(arr[low]);
			low++;
		
		}
		while (high <= end) {
			temp.add(arr[high]);
			high++;
			
		}
		for (int i = 0; i < temp.size(); i++) {
			arr[start + i] = temp.get(i);
		}
		return count;
	}

}
