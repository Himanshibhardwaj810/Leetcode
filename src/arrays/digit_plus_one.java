package arrays;

import java.util.Arrays;

public class digit_plus_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,9,9,9};
//		plusone(arr);
		int[] result=plusOne(arr);
		System.out.println(Arrays.toString(result));
		

	}
	//easiest approach
	public static int[] plusOne(int[] digits) {
		for(int i=digits.length-1;i>=0;i--) {
			if(digits[i]<9) {
				System.out.println("nhvhj");
				digits[i]++;
				return digits;
			}
			digits[i]=0;
		}
		digits=new int[digits.length+1];
		digits[0]=1;
		System.out.println("nhvhj");
		System.out.println(Arrays.toString(digits));
		return digits;
		
	}
	public static void plusone(int[] arr) {
		StringBuilder num=new StringBuilder();
		for(int i=0;i<arr.length;i++) {	
			num.append(arr[i]);
		}

		int digit=Integer.parseInt(num.toString())+1;
		System.out.println(digit);
		char[] digits =String.valueOf(digit).toCharArray();
		System.out.println(Arrays.toString(digits));
		int[] result = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            result[i] = digits[i] - '0'; // Convert char to int
        }
        System.out.println(Arrays.toString(result));


	}


}   
