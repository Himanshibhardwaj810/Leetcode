package Strings;
import java.util.*;


public class all_occurence_are_equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "caacabcbb";
		System.out.println(areOccurrencesEqual(s));

	}

	public static boolean areOccurrencesEqual(String s) {
		HashMap<Character,Integer>map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
				System.out.println(map);
			}else {
				map.put(s.charAt(i), 1);
				System.out.println(map);
			}
		}
//		HashSet<Integer> set=new HashSet<>(map.values());
//		if(set.size()!=1) {
//			return false;
//		}
//		return true;
		int freq=-1;
		for(int values:map.values()){
            if(freq==-1){
            	System.out.println(values);
                freq=values;
            }else if(freq!=values){
            	System.out.println(values);
            	System.out.println(freq);
                return false;

            }
        }
        return true;

	}

}
