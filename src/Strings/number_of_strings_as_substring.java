package Strings;

public class number_of_strings_as_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] patterns = {"a","abc","bc","d"};
		String word = "abc";
		System.out.println(numOfStrings(patterns,word));
		

	}

	public static int numOfStrings(String[] patterns, String word) {
		int count=0;
		for(int i=0;i<patterns.length;i++) {
			if(word.contains(patterns[i])) {
				count++;
			}
		}
		return count;

	}

}
