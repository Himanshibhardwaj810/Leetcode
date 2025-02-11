package Strings;

public class index_of_first_occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "sadbutsad";
		String needle = "sad";
		System.out.println(strStr(haystack, needle));

	}

	public static int strStr(String haystack, String needle) {
		for(int i=0;i<=haystack.length()-needle.length();i++) {
			int j;
			for(j=0;j<needle.length();j++) {
				if(haystack.charAt(i+j)!=needle.charAt(j)) {
					break;//skip the iteration as substring 1st elemnt is noot equal check rest
				}
			}
			if(j==needle.length()) {//now j == needle length
				return i;//as we have to return the starting of substring
			}
		}
		return -1;
		//time complexity: o(m*n)where m is haystack.length() 
		// n is needle length
		//space complexity: o(1)


	}

}
