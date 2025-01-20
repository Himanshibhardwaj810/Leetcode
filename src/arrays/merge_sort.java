package arrays;
import java.util.*;
import java.util.Arrays;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] nums = {5, 3, 8, 6, 2, 7, 4, 1};
	       mergeSort(nums, 0, nums.length - 1);
	       System.out.println(Arrays.toString(nums));

	}
	 public static void mergeSort(int arr[], int start, int end) {
	        if (start >= end) {
	            return;
	        }

	        // Divide the array into two halves
	        int mid = start + (end - start) / 2;
	        System.out.println(mid);

	        // Recursively sort both halves
	        System.out.println(start);
	        
	        mergeSort(arr, start, mid);
	        System.out.println(end);
	        mergeSort(arr, mid + 1, end);

	        // Merge the two sorted halves
	        System.out.println(Arrays.toString(arr));
	        merge(arr, start, mid, end);
	    }

	    public static void merge(int arr[], int start, int mid, int end) {
	    	System.out.println(start);
	    	System.out.println(mid);
	    	System.out.println(end);
	        List<Integer> temp = new ArrayList<>();
	        System.out.println(temp);
	        int low = start, high = mid + 1;
	        System.out.println(low);
	        System.out.println(high);
	        System.out.println(arr[low]);
	        System.out.println(arr[high]);

	        // Merge the two sorted subarrays
	        while (low <= mid && high <= end) {
	            if (arr[low] <= arr[high]) {
	                temp.add(arr[low]);
	                low++;
	            } else {
	                temp.add(arr[high]);
	                high++;
	            }
	        }

	        // Add remaining elements from the left subarray
	        while (low <= mid) {
	        	System.out.println(temp);
	            temp.add(arr[low]);
	            low++;
	        }

	        // Add remaining elements from the right subarray
	        while (high <= end) {
	        	System.out.println(temp);
	            temp.add(arr[high]);
	            high++;
	        }

	        // Copy the sorted elements back into the original array
	        for (int i = 0; i < temp.size(); i++) {
	            arr[start + i] = temp.get(i);
	        }
	    }

}
