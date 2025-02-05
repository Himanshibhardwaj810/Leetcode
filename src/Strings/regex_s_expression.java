package Strings;
import java.util.*;
public class regex_s_expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "   Hello  World   ";
		String[] words = s.split("\s");
		System.out.println(Arrays.toString(words));
		String[] words1 = s.split("\s+");
		System.out.println(Arrays.toString(words1));
		String[] words2 = s.trim().split("\s");
		System.out.println(Arrays.toString(words2));

	}
	//\s	Matches one space, tab, or newline
	//\s+	Matches one or more spaces together
	//split("\\s+")	Splits the string using one or more spaces as a separator, removing extra spaces

}
