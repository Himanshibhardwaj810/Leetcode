package arrays.medium;

public class Search_insert_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int searchInsert(int[] nums, int target) {
		        int start=0;
		        int end=nums.length-1;
		        while(start<=end){
		            int mid=start+(end-start)/2;
		            if(nums[mid]==target){
		                return mid;
		            }else if(nums[mid]<target){
		                start=mid+1;
		            }else{
		                end=mid-1;
		            }
		        }
		        return start;// target is greater than all elements so return length of array
	}
	

}
