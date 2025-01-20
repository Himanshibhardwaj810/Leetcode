package arrays.medium;

import java.util.Arrays;

public class next_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {2,3,1};
		nextPermutation(nums);
		

	}
    public static void nextPermutation(int[] nums) {
    	//finding first decreasing element in the array from last
    	int i=nums.length-1;
    	while(i>0 && nums[i-1]>=nums[i]) {
    		i--;
    	}
    	System.out.println(i);
    	System.out.println(nums[i]);
    	System.out.println(i-1);
//    	System.out.println(nums[i-1]);
    	//find the element just larger to this i element
    	if(i>0) {//i>0 is because agr i==0 hogya iska mtlb hmne sara array traverse kia
    		// or i greatest h iska mtlb vhi permutation bdi h to us case m
    		// array reverse kro eg 3,2,1 ==1,2,3
    	int j=nums.length-1;
    	while( nums[j]<=nums[i-1]) {
    		j--;
    	}
    	System.out.println(nums[j]);
    	//swap i and j
    	swap(nums,i-1,j);
    	}
    	System.out.println(Arrays.toString(nums));
    	//reverse right of dec element 
    	reverse(nums,i,nums.length-1);
    	System.out.println(i);
    	 System.out.println(Arrays.toString(nums));
    	
        
    }
    
    public static void swap( int [] nums,int i ,int j) {
    	int temp=nums[i];
    	nums[i]=nums[j];
    	nums[j]=temp;
    }
    public static void reverse( int [] nums,int start ,int end) {
    	while(start<end) {
    	int temp=nums[start];
    	nums[start]=nums[end];
    	nums[end]=temp;
    	start++;
    	end--;
    	}
    }

}
