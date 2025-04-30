package Striver.medium.Strings;

public class Compare_version_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String version1 = "1.2";
		String version2 = "1.10";
		System.out.println(compareVersion(version1,version2));

	}
    public static  int compareVersion(String version1, String version2) {
    	String[] a=version1.split("\\.");
    	String[] b=version2.split("\\.");
    	int i=0;
    	int j=0;
    	while(i<a.length ||j<b.length) {
    		int num1=0;
    		int num2=0;
    		if(i<a.length) {
    			 num1=Integer.parseInt(a[i]);
    		}
    		if(j<b.length) {
    		num2=Integer.parseInt(b[j]);
    		}
    		if(num1<num2) {
    			return -1;
    		}else if(num1>num2) {
    			return 1;
    		}
    		i++;
    		j++;
    	}
    	return 0;
    	//time complexity=o(m+n) where m,n len of V1 &V2
    	
        
    }

}
