package arrays.striver_sheet;
import java.util.*;
import java.util.Arrays;

public class longest_consecutive_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {101,1,102,4,103,2,3};
		System.out.println(longestConsecutive2(nums));

	}
	//optimal approach
    public static int longestConsecutive2(int[] nums) {
    	HashSet<Integer>set=new HashSet<>();
    	int longest=1;
    	if(nums.length==0) {
    		return 0;
    	}
    	for(int i=0;i<nums.length;i++) {
    		set.add(nums[i]);
    	}
    	System.out.println(set);
    	//traversing the set\
    	for(int num: set) {
    		System.out.println(num);
    		if(!set.contains(num-1)) {
    			int count=1;
    			while(set.contains(num+1)) {
    				num=num+1;
    				System.out.println(num);
    				count++;
    			}
    			System.out.println(count);
    			
    			longest=Math.max(longest,count);
    		}
    	}
    	return longest;
    	
    }



}
