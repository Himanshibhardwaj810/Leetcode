package arrays.striver_sheet;
import java.util.*;
public class longest_substring_without_repeating_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="pwwkew";
		System.out.println( lengthOfLongestSubstring(s));

	}
	
    public static int lengthOfLongestSubstring(String s) {
    	int maxlen=0;
    	HashSet<Character>set=new HashSet<>();
    	int left=0;
    	for(int right=0;right<s.length();right++) {
    		while(set.contains(s.charAt(right))) {
    			set.remove(s.charAt(left));
    			System.out.println(set);
    			left++;
    		}
    		set.add(s.charAt(right));
    		System.out.println(set);
    		maxlen=Math.max(maxlen, right-left+1);
    		
    		
    	}
    	return maxlen; 
        
    }

}
