package arrays.striver_sheet;

public class trapping_rainwater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(nums));
		

	}
	public static int trap(int[]nums) {
		int left=0;
		int right=nums.length-1;
		int leftmax=0;
		int rightmax=0;
		int watertrapped=0;
		while(left<=right) {
			if(nums[left]<=nums[right]) {
				if(nums[left]>=leftmax) {
					leftmax=nums[left];
				}else {
					watertrapped+=leftmax-nums[left];
				}
				left++;
			}else {
				if(nums[right]>=rightmax) {
					rightmax=nums[right];
				}else {
					watertrapped+=rightmax-nums[right];
				}
				right--;
			}
		}
		return watertrapped;
	}

}
