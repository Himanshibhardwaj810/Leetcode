package arrays;
import java.util.*;
public class Majority_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 3 };
		System.out.println(majorityElement(arr));
		System.out.println(majorityElement2(arr));

	}

	public static int majorityElement(int[] nums) {
		int n = nums.length / 2;
		int i=0;
		for ( i = 0; i < nums.length; i++) {
			int count = 1;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
					if (count > n) {
						return nums[i];
					}

				}

			}
		}
		return -1;
	}
	//using hashmap
	public static int majorityElement2(int[] nums) {
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);//creating new key val
				//value pair by adding freq by one in place of nums[i] that
				//is already present
			}else {
			map.put(nums[i],1);
			}
		}
		for(int key: map.keySet()) {
			if(map.get(key)>nums.length/2) {
				return key;
			}
		}
		return -1;
		
	}

}
