package Striver.medium.Strings;

public class Repeated_string_match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcd";
		String b = "cdabcdab";
		System.out.println(repeatedStringMatch(a,b));

	}
    public static int repeatedStringMatch(String a, String b) {
    	StringBuilder ans=new StringBuilder();
    	int count=0;//iniitally ""
    	while(ans.length()<b.length()) {
    		ans.append(a);
    		count++;
    	}
    	System.out.println(ans);
    	if(ans.toString().contains(b)) {
    		return count;
    	}
    	ans.append(a);
    	count++;
    	System.out.println(ans);
    	if(ans.toString().contains(b)) {
    		return count;
    	}
    	return -1;
    	
    }
    //brute force
    public static int repeatedStringMatch2(String a, String b) {
    	String ans="";
    	int i=0;
    	while(i>=0 && !ans.contains(b)) {
    		ans=ans+a;
    		i++;
    	}
    	return i;
        
    }


}
