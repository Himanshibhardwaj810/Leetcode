package arrays.striver_sheet;
import java.util.*;
public class find_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {1,3,4,2,5,6,7,3};
        System.out.println("The duplicate element is " + findDuplicate2slowfast(arr));

	}
	public static int findDuplicate(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return nums[i];
            }
            else{
                set.add(nums[i]);
            }
        }
        return -1;
        //Summary
        //Time Complexity: O(n)
 
        	//Space Complexity:O(n) 

        	
    }
	//first by sorting then duplicate element came adjacent
    public static int findDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
         if(nums[i]==nums[i+1]){
             return nums[i];
         }
        }
        return -1;
        //Time Complexity:O(Nlogn + N)

//Reason: NlogN for sorting the array and O(N) for traversing through the array and checking if adjacent elements are equal or not. But this will distort the array.

//Space Complexity:O(1)
     }
    //slow fast pointer approach 
    public static int findDuplicate2slowfast(int[] nums) {
    	
    	int slow=nums[0];
    	int fast=nums[0];
    	do {
    		slow=nums[slow];
    		fast=nums[nums[fast]];
    	}while(slow!=fast);
    	
    	fast=nums[0];
    	while(slow!=fast) {
    		slow=nums[slow];
    		fast=nums[fast];
    	}
    	return slow;
    	//Time complexity: O(N). Since we traversed through the array only once.

//Space complexity: O(1).

     }

}
