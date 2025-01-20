package arrays.striver_sheet;
import java.util.*;
public class count_subarray_with_xor_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {4, 2, 2, 6, 4};
		int k=6;
		System.out.println(subarray_xor2(nums,k));

	}
	public static int subarray_xor2(int[]nums,int k) {
		int xor=0;
		int count=0;
		HashMap<Integer,Integer>map=new HashMap<>();
		map.put(0, 1);
		for(int i=0;i<nums.length;i++) {
			xor=xor^nums[i];
			int x=xor^k;
			if(map.containsKey(x)) {
				count=count+map.get(x);
			}
			map.put(xor,map.getOrDefault(xor,0)+1);

		}
		return count;
	}
	
	//brute force
	public static int subarray_xor(int[]nums,int k) {
		int n=nums.length-1;
		int count=0;
		for(int i=0;i<n;i++) {
			int xor=0;
			for(int j=i;j<n;j++) {
				xor=xor^nums[j];
				if(xor==k) {
					count++;
				}
			}
		}
		return count;
	}

}
