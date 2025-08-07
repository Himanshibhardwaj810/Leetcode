package arrays;

import java.util.*;	

public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {  0,1, 1};
		System.out.println(removeduplicates2(arr));

	}
	
	//my method
	public static int removeduplicates2(int[] nums) {
		int index=0;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]!=nums[i+1]) {
				nums[index]=nums[i];
				index++;
			}
		}
		nums[index]=nums[nums.length-1];//as last two elements can be equal
		index++;
		return index;
		
	}

	public static int removeduplicates(int[] arr) {
		int k = 0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]!=arr[k]) {
				k++;//as 1st element is unique
				arr[k]=arr[i];
//				arr[k]=arr[i];
//				k++;//we have not done this approach as it doesn't
				//consider first element and ignore it
			}
		}
			
		return k+1;

	}
	
	

}
