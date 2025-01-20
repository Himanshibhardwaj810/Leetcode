package arrays.striver_sheet;

import java.util.*;

public class inversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 3, 2, 1, 4 };
		System.out.println(inversions(arr));
		System.out.println(mergeSort(arr,0,arr.length-1));

	}

	// Brute force approach
	public static int inversions(int[] nums) {
		List<String> temp = new ArrayList();
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					temp.add("(" + nums[i] + "," + nums[j] + ")");
					count++;
				}
			}
		}
		System.out.println(temp);
		return count;
		// time complexity: O(n2)
	}

	// optimal approach
	public static int mergeSort(int arr[], int start, int end) {
		int count = 0;
		if (start >= end) {
			return count;
		}
		if(start < end) {
			int mid = start + (end - start) / 2;
			count = count + mergeSort(arr, start, mid);
			count = count + mergeSort(arr, mid + 1, end);
			count += merge(arr, start, mid, end);
		}

		return count;
	}

	public static int merge(int arr[], int start, int mid, int end) {
		int count = 0;
		List<Integer> temp = new ArrayList<>();
		int low = start;
		int high = mid + 1;
		while (low <= mid && high <= end) {
			if (arr[low] <= arr[high]) {
				temp.add(arr[low]);
				low++;
			} else {
				count += mid - low + 1;// as we have to find the right index elements of current
				// index so we will mid is whole left part -the start index and +1 is for 0th
				// index

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
