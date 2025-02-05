package Strings;
import java.util.*;
public class Roman_to_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="MCMXCIV";
		System.out.println(romanToInt(s));

	}
    public static int romanToInt(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result=0;
        int prev_value=0;//we have to maintain prev pointer as if it getting small then curr then we have to minus
        for(int i=s.length()-1;i>=0;i--) {
        	if(map.containsKey(s.charAt(i))) {
        		int curr_value=map.get(s.charAt(i));
        		if(curr_value<prev_value) {
        			result=result-curr_value;
        		}else {
        			result+=curr_value;
        		}
        		prev_value=curr_value;
        	}	
        }
        return result;
        	
    }

}
