package arrays;
import java.util.*;
public class containsduplicate_absolute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,1,2,3};
		int k=2;
		System.out.println(containsNearbyDuplicate(arr,k));
		

	}
//Brute force
	public static boolean containsNearbyDuplicate(int[] nums, int k){
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if((map.containsKey(nums[i]))) {
				if(Math.abs(map.get(nums[i])-i)<=k) {
					return true;
					
				}
			}
			map.put(nums[i],i);
			System.out.println(map);

		}
		return false;

	}

}
