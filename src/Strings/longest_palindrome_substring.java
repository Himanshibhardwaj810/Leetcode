package Strings;

public class longest_palindrome_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbbd";
		System.out.println(longestPalindrome(s));

	}

	public static String longestPalindrome(String s) {
		String res = "";
		int reslen = 0;
		for (int i = 0; i < s.length(); i++) {
			// odd length substrings
			int left = i;//as single length substring also exist
			int right = i;// expanding across both end of letter to check palindrome or not
			while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
				if (right - left + 1 > res.length()) {
					res = s.substring(left, right + 1);
					System.out.println(res);
					reslen = right - left + 1;// length of the substring
				}
				left--;
				right++;
			}
			// even length substring
			left = i;
			right = i + 1;
			while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
				if (right - left + 1 > res.length()) {
					res = s.substring(left, right + 1);
					System.out.println(res);
					reslen = right - left + 1;
				}
				left--;
				right++;// expand outwards
			}

		}
		return res;

	}

}
