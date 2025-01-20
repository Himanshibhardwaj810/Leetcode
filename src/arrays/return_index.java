package arrays;

public class return_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,3,5,7};
		int target=2;
		System.out.println(searchInsert(arr,target));

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
	        return start;
	        
	    }
	

}
