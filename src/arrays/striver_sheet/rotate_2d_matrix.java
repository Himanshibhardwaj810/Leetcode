package arrays.striver_sheet;
import java.util.*;
public class rotate_2d_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int m = arr.length;
		int n = arr[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		rotate(arr);

	}

	public static void rotate(int[][] matrix) {
		int m = matrix.length ;
		int n = matrix[0].length;
		//find transpose
		for (int i = 0; i < m; i++) {
			for (int j = i; j < n; j++) {
				
				int temp=matrix[i][j];
//				System.out.println(temp);
				matrix[i][j]=matrix[j][i];
//				System.out.println(matrix[i][j]);
				matrix[j][i]=temp;
				
			}
		}
		//reverse
		for (int i = 0; i <m; i++) {
			for (int j = 0; j < n/2; j++) {
				int temp=matrix[i][j];//here n is  3
//				//2-0
//				//2-1
//				//2-2
//				
//				System.out.println(n-j-1);//n-1=2
				matrix[i][j]=matrix[i][n-1-j];
				matrix[i][n-j-1]=temp;
				
			}
		}
		


		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(matrix[i][j]);
			}
			System.out.println();
		}

	}

}
