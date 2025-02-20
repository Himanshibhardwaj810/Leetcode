package arrays.medium;

public class Binary_search_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
     public static boolean searchMatrix(int[][] matrix, int target) {
	       int row=0;
	       int col=matrix[0].length-1;
	       while(row<matrix.length && col>=0){
	        if(matrix[row][col]==target){
	            return true;
	        }else if(matrix[row][col]>target){
	            col--;
	        }else{
	            row++;//as we are standing at the last position of row and it is less so we have to go to next row for further checking
	        }

	       }
	       return false;

	        
	    }

}
