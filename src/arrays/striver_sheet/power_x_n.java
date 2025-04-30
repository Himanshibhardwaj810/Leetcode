 package arrays.striver_sheet;

public class power_x_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myPow( 2.00000,-2));

	}
	//optimal
	 public static double myPow(double x, int n) {
	    	double multiply=1;
	    	long nn=n;
	    	if(n<0) {
	    		nn=nn*-1;
	    	}
	    	while(nn>0) {
	    		if(nn%2==0) {
	    			x=x*x;
	    			nn=nn/2;
	    		}else {
	    			multiply=multiply*x;
	    			nn=nn-1;
	    		}
	    	}
	    	if(n<0) {
	    		multiply=1/multiply;
	    		
	    	}
	    	return multiply;
//	    	Time Complexity: O(log n)
//
//	    	Space Complexity: O(1)
	 }
	//Brute force
    public static double myPow2(double x, int n) {
    	double multiply=1;
    	long nn=n;//as converting of -ve power into positive needs long 
    	//as range of int is  -2,147,483,648 to 2,147,483,647 ,so if the last
    	//number is negative than converting it to +ve the range exceeds of int
    	if(n<0) {
    		nn=nn*-1;
    	}
    	for(int i=0;i<nn;i++) {
    		multiply=multiply*x;
    	}
    	System.out.println(multiply);
    	if(n<0) {
    		multiply=1/multiply;
    		
    	}
    	return multiply;
    	//Time Complexity: O(N)

//Space Complexity: O(1)
        
    }

}
