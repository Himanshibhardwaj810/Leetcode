package Strings;

public class minimum_insertions_to_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "mbadm";
		System.out.println(minInsertions(s));

	}

	// minimum insertions to make a string palindrome=length of string -longest
	// palindromic subsequence
	public static int minInsertions(String s) {
		int reslen = 0;
		for (int i = 0; i < s.length(); i++) {
			// odd length palindrome
			int left = i;
			int right = i;
			while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
				if (right - left + 1 > reslen) {
					reslen = right - left + 1;
				}
				left--;
				right++;

			}
			// even length palindrome
			left = i;
			right = i+1;
			while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
				if (right - left + 1 > reslen) {
					reslen = right - left + 1;
				}
				left--;
				right++;

			}
			System.out.println(reslen);

		}
		return s.length()-reslen;

	}

}
