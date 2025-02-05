package Strings;
import java.util.*;
public class reverse_word_inString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "a good   example";
		System.out.println(reverseWords(s));
	}
    public static String reverseWords(String s) {
    	StringBuilder ans=new StringBuilder();
     	s=s.trim();
 		String[] words= s.split("\s+");
 		for(int i=words.length-1;i>=0;i--) {
 			ans.append(words[i]);
 			if(i>0) {
 				ans.append(" ");
 			}
 		}
 		return ans.toString();
    }
//In Java, \s+ is a regular expression (regex) that helps split a string based on spaces.

// \s → Matches any whitespace character (space, tab, newline).
//+ → Means "one or more times" (it groups multiple spaces together).
    //but we still have to use trim as this //s+ doesn't remove extra space
}
