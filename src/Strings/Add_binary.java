package Strings;

public class Add_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="1010";
		String b="111";
		System.out.println(addBinary(a,b));

	}

	public static String addBinary(String a, String b) {
		int carry=0;
		StringBuilder ans=new StringBuilder();
		int sum=0;
		int i=a.length()-1;
		int j=b.length()-1;
		while(i>=0 || j>=0|| carry!=0) {
			int bitA=0;
			int bitB=0;
			if(i>=0) {
				bitA=a.charAt(i)-'0';//'1'=49 => 49-48=1
				i--;
			}
			if(j>=0) {
				bitB=b.charAt(j)-'0';//'0'= 48 => 48-48=0
				j--;
			}
			System.out.println(bitA);
			System.out.println(bitB);
			System.out.println(sum);
			 sum=bitA+bitB+carry;
			 ans.append(sum%2);//2%2=0
			 carry=sum/2;//2/2=1
//			 i--;j--;
			 //this will alse give  the same ans but the only fact is the leetcode platform
			 //result is high in above one process
			
		}
		ans.reverse();
		return ans.toString();
//Time Complexity: O(max(N, M)) where n.m are length of a and b strings resp.
		//Space Complexity: O(max(N, M))
	}

}
