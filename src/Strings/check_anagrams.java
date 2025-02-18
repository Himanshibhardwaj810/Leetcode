package Strings;
import java.util.*;
public class check_anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "anagram";
		 String t = "nagaram";
		 System.out.println(isAnagram(s,t));

	}
	 public static boolean isAnagram(String s, String t) {
	        char[] str1=s.toCharArray();
	        char[] str2=t.toCharArray();
	        Arrays.sort(str1);
	        Arrays.sort(str2);
	        if(Arrays.equals(str1,str2)){
	            return true;
	        }
	        return false;
//time complexity=o(nlog n+mlogm)	        
//Space complexity=o(n+m)// as takaing char array of n,m len for s & t
	        
	        
	    }

}
