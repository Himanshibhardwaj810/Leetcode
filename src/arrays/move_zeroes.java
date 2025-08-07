package arrays;

import java.util.Arrays;

public class move_zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,0,3,12,0};
		moveZeroes(nums);
		moveZeroes2(nums);

	}
	public static void moveZeroes2(int[] nums) {
	int nonzero_index=0;
	for(int i=0;i<nums.length;i++) {
		if(nums[i]!=0) {
			nums[nonzero_index]=nums[i];
			nonzero_index++;
		}
	}
	for(int i=nonzero_index;i<nums.length;i++) {
		nums[i]=0;
	}
	System.out.println(Arrays.toString(nums));
	}
	
	
    public static void moveZeroes(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
       
        int count=0;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]==0) {
        		count++;
        	}
        }
        System.out.println(count);
        if(count!=0) {
        for(int i=0;i<count;i++) {
        	int temp=nums[0];
        	for(int j=1;j<nums.length;j++) {
        		nums[j-1]=nums[j];
        	}
        	nums[nums.length-1]=temp;
        	
        }
        }
        System.out.println(Arrays.toString(nums));
    }


}
