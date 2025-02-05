package Strings;

public class Longest_common_prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs= {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
		

	}

	public static String longestCommonPrefix(String[] strs) {
		StringBuilder ans = new StringBuilder();
		String input = strs[0];
		
		for (int i = 1; i < strs.length ; i++) {
			int j = 0;
			while (j < input.length() && j < strs[i].length()) {
				System.out.println(strs[i].charAt(j));
				if (input.charAt(j) != strs[i].charAt(j)) {

					j++;
				}else {
					ans.append(strs[i].charAt(j));
					System.out.println(ans);
				}
			}

		}

		return ans.toString();

	}

}
