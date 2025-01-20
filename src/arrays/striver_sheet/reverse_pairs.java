package arrays.striver_sheet;

import java.util.*;

public class reverse_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,3,2,3,1};
		System.out.println(reversePairs(nums));

	}

	public static int reversePairs(int[] nums) {
		return mergeSort(nums, 0, nums.length - 1);

	}

	public static int mergeSort(int[] nums, int start, int end) {
		int count = 0;
		if (start < end) {
			int mid = start + (end - start) / 2;
			count = count + mergeSort(nums, start, mid);
			count = count + mergeSort(nums, mid + 1, end);
			count+=CountPairs(nums,start,mid,end);
			merge(nums, start, mid, end);
		}
		return count;
	}

	public static int CountPairs(int[] nums, int start, int mid, int end) {
		int count=0;
		int low=start;
		int high=mid+1;
		for(int i=low;i<=mid;i++) {
			while(high<=end &&(long) nums[i]>(long)2*nums[high]) {
				high++;
			}
			count=count+(high-(mid+1));
		}
		return count;
	}

	public static void merge(int[] nums, int start, int mid, int end) {
		List<Integer> temp = new ArrayList<>();
		int low = start;
		int high = mid+1;
		while (low <= mid && high <= end) {
			if (nums[low] > nums[high]) {
				temp.add(nums[high]);
				high++;
			} else {
				temp.add(nums[low]);
				low++;
			}

		}
		while (low <= mid) {
			temp.add(nums[low]);
			low++;
		}
		while (high <= end) {
			temp.add(nums[high]);
			high++;

		}
		for (int i = 0; i < temp.size(); i++) {
			nums[start + i] = temp.get(i);
		}


	}
//	Time Complexity: O(2N*logN), where N = size of the given array.
//			Reason: Inside the mergeSort() we call merge() and countPairs() except mergeSort() itself. Now, inside 
		//the function countPairs(), though we are running a nested loop, we are actually iterating the left half once and the right half once in total. That is why, the time complexity is O(N). And the merge() function also takes O(N). The mergeSort() takes O(logN) time complexity. Therefore, the overall time complexity will be O(logN * (N+N)) = O(2N*logN).
//
//			Space Complexity: O(N), as in the merge sort We use a temporary array to store elements in sorted order.

}
