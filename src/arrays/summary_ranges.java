package arrays;
import java.util.*;
public class summary_ranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {0,1,2,4,5,7};
		System.out.println(summaryRanges(arr));

	}
    public static  List<String> summaryRanges(int[] nums){
    	List<String>list=new ArrayList<>();
    	
    	for(int i=0;i<nums.length;i++) {
    		int start=nums[i];
    		while(i+1<nums.length && nums[i+1]-nums[i]==1 ) {
    			i++;
    		}
    		if(start!=nums[i]) {
    			list.add(start+"->"+nums[i]);
    			System.out.println(list);
    		}else {
    			list.add(start+"");
    			System.out.println(list);
    		}
    	}
    	return list;

    }

}
