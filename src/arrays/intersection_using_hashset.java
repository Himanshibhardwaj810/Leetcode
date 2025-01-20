package arrays;
import java.util.*;
public class intersection_using_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {1,2,2,1};
		int[] nums2= {2,2};
		int[] result=intersection( nums1, nums2);
		System.out.println(Arrays.toString(result));

	}
    public static int[] intersection(int[] nums1, int[] nums2) {
    	HashSet<Integer> set=new HashSet<>();
    	for(int i=0;i<nums1.length;i++) {
    		set.add(nums1[i]);
    		System.out.println(set);
    	}
    	//another set to compare
    	HashSet<Integer> intersection=new HashSet<>();
    	for(int i=0;i<nums2.length;i++) {
    		if(set.contains(nums2[i])) {
    			intersection.add(nums2[i]);
    			System.out.println(intersection);
    		}
    	}
    	
    	//conversion of set into array
    	int[]result=new int[intersection.size()];
    	int index=0;
    	for(int num :intersection) {
    		result[index]=num;
    		index++;
    	}
    	System.out.println(Arrays.toString(result));
    	return result;
    	
    	
    	

        
    }

}
