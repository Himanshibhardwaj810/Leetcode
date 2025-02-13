package Strings;

public class is_string_prefix_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "iloveleetcode";
		String[] words = {"apples","i","love","leetcode"};
		System.out.println(isPrefixString(s,words));

	}
    public static boolean isPrefixString(String s, String[] words) {
    	StringBuilder builder=new StringBuilder();
    	for(int i=0;i<words.length;i++) {
    		builder.append(words[i]);
    		if(builder.length()>s.length()) {
    			return false;
    		}
    		if(builder.toString().equals(s)) {
    			return true;
    		}
    	}
    	return  false;


    }

}
