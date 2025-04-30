package arrays.striver_sheet;
import java.util.*;
public class Four_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,0,-1,0,-2,2};
		int target=0;
		System.out.println(fourSum(nums,target));

	}
	//brite force
	//time complexity=o(n4)
	//space complexity= 0(1);

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> list=new ArrayList<>();
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		for(int i=0;i<nums.length-3;i++) {
			if(i>0 && nums[i]==nums[i-1]) {
				continue;
			}
			for(int j=i+1;j<nums.length-2;j++) {

			if(j>i+1 && nums[j]==nums[j-1]) {
				continue;
			}
			int left=j+1;
			int right=nums.length-1;
			while(left<right) {
				int sum=nums[i]+nums[j]+nums[left]+nums[right];
				if(sum==target) {
					list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
					while(left<right && nums[left]==nums[left+1]) {
						left++;
					}
					while(left<right && nums[right]==nums[right-1]) {
						right--;
					}
					left++;
					right--;
				}else if(sum<target) {
					left++;
				}else {
					right--;
				}
			}
			}
			
		}
		return list;

	}
	//time complexity=o(n3)
	//space complexity= 0(1)

}
