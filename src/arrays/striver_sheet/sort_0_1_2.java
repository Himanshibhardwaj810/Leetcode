package arrays.striver_sheet;

import java.util.Arrays;

public class sort_0_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {2,0,2,1,1,0};
		sort(nums);

	}
	public static void sort(int[] nums) {
        int count_i=0;
        int count_j=0;
        int count_k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count_i++;
            }else if(nums[i]==1){
                count_j++;
            }else{
                count_k++;
            }
        }
        int k=0;
        for(int m=0;m<count_i;m++){
            nums[k]=0;
            k++;
        }
        for(int n=0;n<count_j;n++){
            nums[k]=1;
            k++;
        }
        for(int p=0;p<count_k;p++){
            nums[k]=2;
            k++;
        }
        System.out.println(Arrays.toString(nums));
	}
//Time Complexity: O(N) + O(N), where N = size of the array. First O(N) for counting the number of 0’s, 1’s, 2’s, and second O(N) for placing them correctly in the original array.

//Space Complexity: O(1) as we are not using any extra space.
}
