package Strings;

public class Reverse_prefix_of_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "abcdefd";
		char ch = 'd';
		System.out.println(reversePrefix(word,ch));

	}
    public static String reversePrefix(String word, char ch) {
    	StringBuilder ans=new StringBuilder();
    	for(int i=0;i<word.length();i++) {
    		if(word.charAt(i)==ch) {
    			int end=i;
    			for(int j=end;j>=0;j--){
    				ans.append(word.charAt(j));
    			}
    			ans.append(word.substring(i + 1));//here i+1 define the starting of the substring
    			return ans.toString();//substring(int beginIndex)
    		}
    	}
    	return word;
        
    }
    //String str = "abcdef";
    //System.out.println(str.substring(1, 4)); // Output: "bcd"

}
