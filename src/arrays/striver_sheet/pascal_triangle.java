package arrays.striver_sheet;
import java.util.*;
public class pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		generate(5);
		System.out.println(generateElement(4,3));

	}
	//we are given with nth row and we have to print entire triangle
	public static List<Integer> generateRows(int row){
		int ans=1;
		List<Integer>temp=new ArrayList<>();
		temp.add(1);
		for(int col=1;col<row;col++) {
			ans=ans*(row-col);//we have to use combination n-1 C r-1
			ans=ans/col;
			System.out.println(ans);
			temp.add(ans);
		}
		System.out.println(temp);
		return temp;
		
	}
	
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=1;i<=numRows;i++) {
        	result.add(generateRows(i));
        }
        System.out.println(result);
        return result;
    }
    
    //if we have given with row and col we have to print the element then
    public static int generateElement(int numRows,int numCols) {
    	int res=1;
    	for(int i=0;i<numCols-1;i++) {
    		res=res*(numRows-i);
    		res=res/(i+1);
    	}
    	return res;
        
    }
//Time Complexity: O(n2), where n = number of rows(given).
    //Reason: We are generating a row for each single row. The number of rows is n. And generating an entire row takes O(n) time complexity.

    //Space Complexity: In this case, we are only using space to store the answer. That is why space complexity can still be considered as O(1).
}
