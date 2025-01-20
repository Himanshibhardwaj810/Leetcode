package arrays;
import java.util.*;
public class intersection_using_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {1,2,2,1};
		int[] nums2= {2,2};
		int[] result=intersect( nums1, nums2);
		System.out.println(Arrays.toString(result));

	}
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++) {
        	if(map.containsKey(nums1[i])) {
        		map.put(nums1[i],map.get(nums1[i])+1);
        		System.out.println(map);
        	}else {
        	map.put(nums1[i],1);
        	System.out.println(map);
        	}
        }
        List<Integer> list=new ArrayList<>();
        for(int j=0;j<nums2.length;j++) {
        	if(map.containsKey(nums2[j]) && map.get(nums2[j])>0) {
        		list.add(nums2[j]);
        		System.out.println(list);
        		map.put(nums2[j],map.get(nums2[j])-1);
        		System.out.println(map);
        	}
        }
    	int[]result=new int[list.size()];
    	for(int i=0;i<list.size();i++) {
    		result[i]=list.get(i);
    	}
    	System.out.println(Arrays.toString(result));

    	return result;
    }

}
