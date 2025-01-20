package arrays;

import java.util.Arrays;

public class merge_sorted_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {1,2,0,0,0};
		int[] nums2= {3,4,6};
		int m=2;
		int n=3;
		merge(nums1,m,nums2,n);

	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		//start merging from the last as 1st elements are already sorted and
		//no need to change t we only have to them we only have to insert
		//them at last position
		int i=m-1;
		int j=n-1;
		int k=m+n-1;
		while(i>=0 && j>=0) {
			System.out.println(nums1[i]);
			System.out.println(nums2[j]);
			if(nums1[i]>nums2[j]) {
				nums1[k]=nums1[i];
				i--;
				k--;
			}else {
				nums1[k]=nums2[j];
				j--;
				k--;
			}
		}
		while(j>=0) {
			nums1[k]=nums2[j];
			j--;
			k--;
			//we don't have to add nums1 as this are already sorted 
			
			
		}
		System.out.println(Arrays.toString(nums1));
	}

}
