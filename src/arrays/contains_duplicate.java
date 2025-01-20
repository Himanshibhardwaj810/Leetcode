package arrays;
import java.util.*;
public class contains_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,1};
		System.out.println(containsDuplicate(arr));
		System.out.println(containsDuplicatesecond(arr));

	}
//Brute force
	public static boolean containsDuplicate(int[] nums) {
		for (int k = 0; k < nums.length; k++) {
			for (int i = k + 1; i < nums.length; i++) {
				if (nums[k] == nums[i]) {
					return true;
				}
			}
		}
		return false;
	}
	//using hashset
	public static boolean containsDuplicatesecond(int[] nums) {
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			if(set.contains(nums[i])) {
				return true;
			}else {
				set.add(nums[i]);
				System.out.println(set);
			}
		}
		return false;
	}

}
