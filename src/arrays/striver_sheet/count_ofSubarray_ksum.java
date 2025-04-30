package arrays.striver_sheet;

import java.util.HashMap;

public class count_ofSubarray_ksum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {1, 2,3};
		System.out.println(subarray_ksum(nums,3));

	}
	public static int subarray_ksum(int[] nums, int k) {
		int sum = 0;
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		// here we ARe storing sum ,count
		map.put(0, 1);//if the sum of elemnts  is equal to k then the count should be incremnetdd
		//Add (0, 1) to the map at the start to handle cases where the subarray starting from index 0 sums to k.
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			System.out.println(map);
			if (map.containsKey(sum - k)) {
				count = count + map.get(sum - k);
			}
			//sum is stored in hashmap in order to store the prefix sums
			map.put(sum, map.getOrDefault(sum,0) + 1);
			System.out.println(map);
			//if the sum doesn't exist in map then initialize it with default 0 then addding 1

		}
		return count;
	}
//map.getOrDefault(key, defaultValue)
	//key: The key to search for in the map.
	//defaultValue: The value to return if the key is not found in the map.

}
