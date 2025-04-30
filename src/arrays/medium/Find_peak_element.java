package arrays.medium;

public class Find_peak_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {0,10,5,2};
		System.out.println(findPeakElement(arr));
		System.out.println(findpeak(arr));
		System.out.println(findpeak2(arr));

	}

	// linear_Search
	public static int findPeakElement(int[] nums) {
		int max = Integer.MIN_VALUE;
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
				index = i;
			}
		}
		return index;
	}
	//binary search//universallllll
	public static int findpeak(int[]nums) {
		int start=0;
		int end=nums.length-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(nums[mid]<nums[mid+1] ){//in inc part
				start=mid+1;	
			}else if(nums[mid]>nums[mid+1]) {
				end=mid;//in dec PART
			}
		}
		return start;//when start=end that is peak position 
	}
	//binary search
		public static int findpeak2(int[]nums) {
			int start=0;
			int end=nums.length-1;
			while(start<end) {
				int mid=start+(end-start)/2;
				if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) {
					return mid;
				}
				if(nums[mid]>nums[mid-1] && nums[mid]<nums[mid+1]){//in inc part
					start=mid+1;	
				}else if(nums[mid]<nums[mid-1] && nums[mid]>nums[mid+1]) {
					end=mid;//in dec PART
				}
			}
			return start;//when start=end that is peak position 
		}

}
