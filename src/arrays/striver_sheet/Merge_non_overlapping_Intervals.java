package arrays.striver_sheet;
import java.util.*;
public class Merge_non_overlapping_Intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals= {
				{1,3},{2,6},{8,10},{15,18}
		};
		int m = intervals.length;
		int n = intervals[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(intervals[i][j]);
			}
			System.out.println();
		}
		int[][]result=merge2(intervals);
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.println(result[i][j]);
			}
			System.out.println();
		}
		
		

	}
	//withoiut using extra space
    public static int[][] merge2(int[][] intervals) {
    	//sorting intervals based on startibng time
    	Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));


    	int index=0;//to track the temp
    	for(int i=1;i<intervals.length;i++) {
    	//overlapping intervals merge them
    		if(intervals[index][1]>=intervals[i][0]) {
    			intervals[index][1]=Math.max(intervals[index][1], intervals[i][1]);
    		}else {
    			index++;
    			intervals[index]=intervals[i];
    		}
    	}
    	int[][] result=new int[index+1][2];
    	for(int i=0;i<=index;i++) {
    		result[i]=intervals[i];
    	}
    	return result;


    }
    public static int[][] merge(int[][] intervals) {
    	//sorting intervals based on startibng time
    	Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
    	int [][] temp=new int[intervals.length][2];
    	
    	temp[0]=intervals[0];
    	int index=0;//to track the temp
    	for(int i=1;i<intervals.length;i++) {
    	//overlapping intervals merge them
    		if(temp[index][1]>=intervals[i][0]) {
    			temp[index][1]=Math.max(temp[index][1], intervals[i][1]);
    		}else {
    			index++;
    			temp[index]=intervals[i];
    		}
    	}
    	int[][] result=new int[index+1][2];
    	for(int i=0;i<=index;i++) {
    		result[i]=temp[i];
    	}
    	return result;


    }

}
