package TCS;

public class greater_than_prior_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {7,4,8,2,9};
		System.out.println(priorElement(arr));
		System.out.println(maxsoFar(arr));

	}
	public static int priorElement(int[]arr) {
		int count=1;
		
		for(int i=1;i<arr.length;i++) {
			boolean flag=true;//in order to detect that all elements prior to it small
			for(int j=i-1;j>=0;j--) {
				if(arr[j]>arr[i]) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				count++;
			}
			
		}
		return count;
	}
	//2nd approach using maximum approach
	public static int maxsoFar(int[]arr) {
		int count=1;
		int maxsofar=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>maxsofar) {
				maxsofar=arr[i];
				count++;
			}
		}
		return count;
	}

}
