package Strings;

public class Longest_common_prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs= {"a","a","b"};
		System.out.println(longestCommonPrefix(strs));
		

	}

	public static String longestCommonPrefix(String[] strs) {
		StringBuilder ans = new StringBuilder();
		String input = strs[0];
		for(int i=0;i<input.length();i++) {//traversing 1st string 
			char ch=input.charAt(i);
			System.out.println(ch);
			for(int j=1;j<strs.length;j++) {//traversing string array
				System.out.println(strs[j].charAt(i));
				if(i>=strs[j].length() || strs[j].charAt(i)!=ch) {//here equal is taken as when the length is 0 like a,b,c so it will not compare the values
					return ans.toString();//here we are checking or comparing 1st string with rest of strings
				}
				//equal to is bcoz as input==strs[i] so stop checking and return string ans
			}
			ans.append(ch);
		}
		return ans.toString();
		
		

	}

}
