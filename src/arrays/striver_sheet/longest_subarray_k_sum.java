package arrays.striver_sheet;

import java.util.*;

public class longest_subarray_k_sum {
//this questi0on retrieves lenght of largets subarray
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3, 1, 2, 5, 1, 1, 4};
		System.out.println(subarray_Othsum(nums));
		System.out.println(subarray_ksum(nums, 6));

	}

	public static int subarray_Othsum(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();// here 1st store prefix sum, second index
		int sum = 0;
		int maxlen = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			if (sum == 0) {
				maxlen = i + 1;
			}
			if (map.containsKey(sum)) {
				maxlen = Math.max(maxlen, i - map.get(sum));
			} else {
				map.put(sum, i);
			}
		}
		return maxlen;
	}

	// with k sum
	public static int subarray_ksum(int[] nums, int k) {
		int sum = 0;
		int maxlen = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		// here we ARe storing sum ,count
//if the 1st elemnt of array sum is equal to k
		for (int i = 0; i < nums.length; i++) {
			sum=sum+nums[i];
			System.out.println(map);
			if(sum==k) {
				maxlen=i+1;
			}
			if(map.containsKey(sum-k)) {
				int startindex=map.get(sum-k);
				maxlen=Math.max(maxlen, i-startindex);
			}        
			if (!map.containsKey(sum)) {
	            map.put(sum, i);//as we are maintaing map of prefix sum
	        }
			
		}
		return maxlen ;
	}
//map.getOrDefault(key, defaultValue)
	//key: The key to search for in the map.
	//defaultValue: The value to return if the key is not found in the map.
}
