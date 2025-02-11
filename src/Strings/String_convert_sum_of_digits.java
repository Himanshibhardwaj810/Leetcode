package Strings;

public class String_convert_sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "zbax";
		int k=3;
		System.out.println(getLucky2(s,k));
		System.out.println(getLucky(s,k));

	}
	//easy approach
    public static int getLucky(String s, int k) {
    	int sum=0;
    	for(int i=0;i<s.length();i++) {
    		int num=s.charAt(i)-'a'+1;//to convert it into num
    		//calculate sum side by side
    		System.out.println(num);
    		while(num>0) {
    			sum=sum+num%10;//one time sum
    			num=num/10;	
    		}
    		System.out.println(sum);
    	}
    	int count=1;
    	while(count<k) {
    		int newsum=0;
    		while(sum>0) {
    			newsum=newsum+sum%10;
    			sum=sum/10;
    		}
    		System.out.println(newsum);
    		sum=newsum;
    		count++;
    	}
    	return sum;
    }
	//lengthy process
    public static int getLucky2(String s, int k) {
    	StringBuilder ans=new StringBuilder();
    	for(int i=0;i<s.length();i++) {
    		char ch=s.charAt(i);
    		int position=ch-'a'+1;
    		ans.append(position);
    	}
    	int num=Integer.parseInt(ans.toString());
    	return sumofdigits(num,k);
        
    }
    public static int sumofdigits(int num,int k) {
    	int sum=0;
    	if(k==0) {
    		return num;//we are nit returning sum as in last base case sum is 0 and we have toreturn the num
    	}
    	while(num>0) {
    		sum=sum+num%10;
    		num=num/10;
    	}
    	return	sumofdigits(sum,k-1);


    }
    

}
