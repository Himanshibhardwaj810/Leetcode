package Striver.medium.Strings;

public class CountandSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(4));

	}
    public static String countAndSay(int n) {
    	if(n==1) {
    		return "1";
    	}
        String prevterm=countAndSay(n-1);
        int count=1;
        String ans="";
        int i;
        for( i=0;i<prevterm.length()-1;i++) {
        	if(prevterm.charAt(i)==prevterm.charAt(i+1)) {
        		count++;
        	}else {
        		ans+=count;
        		ans+=prevterm.charAt(i);
        		count=1;
        	}
        }
        ans+=count;
		ans+=prevterm.charAt(i);
		return ans;
        
        
    }

}
