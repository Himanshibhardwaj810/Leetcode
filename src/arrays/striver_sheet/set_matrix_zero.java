package arrays.striver_sheet;

import java.util.Arrays;

public class set_matrix_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {
				{1,1,1,1},
				{1,0,1,1},
				{1,1,0,1},
				{1,0,0,1},
		
		};
    	int m=arr.length;
    	int n=arr[0].length;
    	for(int i=0;i<m;i++) {
    		for(int j=0;j<n;j++) {
    			System.out.println(arr[i][j]);
    		}
    		System.out.println();
    	}
		
		setZeroes(arr);
		

	}
    public static void setZeroes(int[][] matrix) {
    	int m=matrix.length;
    	int n=matrix[0].length;
    	
    	int[] row=new int[m];//row array
    	int[] col=new int[n];//col array
    	for(int i=0;i<m;i++) {
    		for(int j=0;j<n;j++) {
    			if(matrix[i][j]==0) {
    				row[i]=1;
    				col[j]=1;
    			}
    		}
    	}
    	for(int i=0;i<m;i++) {
    		for(int j=0;j<n;j++) {

    			
    			if(row[i]==1 || col[j]==1) {

    				matrix[i][j]=0;
    			}
    		}
    	}
    	for(int i=0;i<m;i++) {
    		for(int j=0;j<n;j++) {
    			System.out.println(matrix[i][j]);
    			
    		}
    		System.out.println();
    	}
    	//Time Complexity: O(2*(N*M)), where N = no. of rows in the matrix and M = no. of columns in the matrix.
    	//Reason: We are traversing the entire matrix 2 times and each traversal is taking O(N*M) time complexity.

    	//Space Complexity: O(N) + O(M), where N = no. of rows in the matrix and M = no. of columns in the matrix.
    	//Reason: O(N) is for using the row array and O(M) is for using the col array.

    	
        
    }

}
