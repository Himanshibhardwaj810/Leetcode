package TCS;

public class max_vehicle_row {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr= {{0,1,0},
				{1,1,0},
				{1,0,0}
				};
		System.out.println(maxVehicle(arr));

	}
	public static int maxVehicle(int[][] arr) {
		int maxsofar=Integer.MIN_VALUE;
		
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==1) {
					count++;
				}
			}
			if(count>maxsofar) {
				maxsofar=count;
				index=i+1;
			}
		}
		return index;
	}

}
