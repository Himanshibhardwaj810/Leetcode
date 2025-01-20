package arrays;

import java.util.*;	

public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {  0,1, 1, 2,3,4,4};
		System.out.println(removeduplicates(arr));

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
