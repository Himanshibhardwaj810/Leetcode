package arrays.striver_sheet;

public class search_2d_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		System.out.println(searchMatrix2(arr,23));
		

	}
    public  static boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
        
    }
    public static  boolean searchMatrix2(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
        	System.out.println(matrix[row][col]);
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]>target){
                col--;//to move to smaller values
            }else{
                row++;//to move to greater values
            }

        }
        return false;
       //time complexity o(m+n) m=rows,n=cols
     

    }
	
	

}
