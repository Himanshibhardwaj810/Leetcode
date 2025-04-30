package arrays;

import java.util.Arrays;

public class quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, 15, 4, 3, 10 };
		quicksort(arr, 0, arr.length - 1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

	public static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int index = start - 1;
		for (int i = start; i < end; i++) {
			if (arr[i] < pivot) {
				index++;
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}
		index++;
		int temp = arr[end];// if traverse all array then swap pivot with index
		arr[end] = arr[index];
		arr[index] = temp;//if we take pivot so this will swap in this function only to make change in original array we take arr[end]
		return index;// return index of pivot

	}

	// approach = index=-1;i<pivot;index++; swap(i,index)
	public static void quicksort(int arr[], int start, int end) {
		if (start >= end) {
			return;
		}
		int pivotindex = partition(arr, start, end);
		quicksort(arr, start, pivotindex - 1);
		quicksort(arr, pivotindex + 1, end);

	}

}
