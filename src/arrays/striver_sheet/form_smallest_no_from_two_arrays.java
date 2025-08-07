package arrays.striver_sheet;
import java.util.*;
public class form_smallest_no_from_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums1= {6,4,3,7,2,1,8,5};
		int[]nums2= {6,8,5,3,1,7,4,2};
		System.out.println(minNumber(nums1,nums2));

	}
    public static int minNumber(int[] nums1, int[] nums2) {
        int min1=10;
        int min2=10;//as min digit is always less than 10 it is 1 to 9
        HashSet<Integer>set=new HashSet<>();//to uniquely store data
        for(int i=0;i<nums1.length;i++) {
        	if(nums1[i]<min1) {
        		min1=nums1[i];
        	}
        	set.add(nums1[i]);
        }
        System.out.println(min1);
        int smallestCommon=10;
        for(int i=0;i<nums2.length;i++) {
        	if(set.contains(nums2[i])) {//for this ex whether min 1 is 1 but we are checking whether
        		//set contains nums2 element so it is 6 so it return 6
        		if(nums2[i]<smallestCommon) {
        			smallestCommon=nums2[i];//as set contains only common elements
        		}
        	}
        	
        	if(nums2[i]<min2) {
        		min2=nums2[i];
        	}
        }
        if(smallestCommon!=10) {
        	return smallestCommon;
        }
        
        int result=Math.min(min1*10+min2,min2*10+min1);
        return result;
    }
    
    //Time complexity=o(m+n)
    //space complexity=o(n)

}
