package arrays.medium;

import java.util.Arrays;

public class first_and_last_position_inSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {5,7,7,8,8,10};
		int target=8;
		int[] result=searchRange(nums,target);
		System.out.println(Arrays.toString(result));
		//simple approach
		int[] result2=searchRange2(nums,target);
		System.out.println(Arrays.toString(result2));

	}
    public static int[] searchRange(int[] nums, int target) {
    	int start=0;
    	int end=nums.length-1;
    	while(start<=end) {
    		if(nums[start]==target && nums[end]==target) {
    			return new int[] {start,end};
    		}
    		if(nums[start]<target) {
    			start++;
    		}else if(nums[end]>target) {
    			end--;
    		}
    	}
    	return new int[] {-1,-1};
        
    }
    //simple approach1
    public static int[] searchRange2(int[] nums, int target) {
    	int first=-1;
    	int last=-1;
    	for(int i=0;i<nums.length;i++) {
    		if(nums[i]==target) {
    			if(first==-1) {
    				first=i;
    			}
    			last=i;
    		}
    	}
    	return new int[] {first,last};
    	
    }

}
