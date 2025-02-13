package Strings;

public class length_last_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord2(" Hello world     "));
		

	}
	//optimized
	public static int lengthOfLastWord2(String s) {
		int length=0;
		int i=s.length()-1;
		while(i>=0 && s.charAt(i)==' ') {
			i--;
		}
		while(i>=0 && s.charAt(i)!=' ') {
			length++;
			i--;
		}
		return length;
		
	}
	//brute force
	public static int lengthOfLastWord(String s) {
        String[] input=s.trim().split("\s+");
        String ans=input[input.length-1];
        System.out.println(input.length);
        return ans.length();
        
    }

}
