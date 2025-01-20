package arrays;

public class missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(nums));

	}
    public static int missingNumber(int[] nums) {
    	int n=nums.length;
    	int sum=n*(n+1)/2;
    	for(int i=0;i<n;i++) {
    		 sum=sum-nums[i];
    	}
    	return sum;
    	
        
    }

}
