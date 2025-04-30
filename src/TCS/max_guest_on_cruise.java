package TCS;

public class max_guest_on_cruise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr1= {3,5,2,0};
		int[]arr2={0,2,4,4};
		System.out.println(maxGuest(arr1,arr2));

	}
	public static int maxGuest(int[]arr1,int[]arr2) {
		int i=0;
		int j=0;
		int maxsofar=Integer.MIN_VALUE;
		int sum=0;
		while(i<arr1.length && j<arr2.length) {
			sum=sum+(arr1[i]-arr2[j]);
			if(sum>maxsofar) {
				maxsofar=sum;
			}
			i++;
			j++;
		}
		return maxsofar;
	}

}
