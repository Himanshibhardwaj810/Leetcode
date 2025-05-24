package Stack_and_Queues.Stack_and_Queues_part2;

public class celebrity_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// brute force
	public int celebrity2(int mat[][]) {
		// we initially let the person is candidate
		int n = mat.length;
		for (int person = 0; person < n; person++) {
			boolean knowsNoOne = true;
			boolean knownByEverybody = true;

			// row check Does person know anyone?
			for (int j = 0; j < n; j++) {
				if(person!=j && mat[person][j]==1 ) {
					knowsNoOne=false;
					break;
				}
			}
			// Column check: Does everyone know person?
			for(int i=0;i<n;i++) {
				if(i!=person && mat[i][person]==0) {
					knownByEverybody=false;
					break;
				}
			}
			
			if(knowsNoOne && knownByEverybody) {
				return person;
			}
		}
		return -1;
	}
	// optimal approach
//	we have to remember two things:
//		the celebrity doesn't know anyone means all rows are 0
//		the celebrity is known by everyone means cols value are 1

//	so here we use elimination method so we consider candidate oth index as celebrity
//	then if canditate[1]==1 it means candidate know 1 so it can't be celebrity then 
//	candidate become i and so on at last only one element is left
//	then we just verify it by row col check if it celebrity
	public int celebrity(int mat[][]) {
		int candidate = 0;
		for (int i = 0; i < mat.length; i++) {
			if (mat[candidate][i] == 1) {
				candidate = i;
			}
		}
		// Verify the candidate
		for (int i = 0; i < mat.length; i++) {
			if (i != candidate)// as we don't have to check the candidate
				if (mat[candidate][i] == 1 || mat[i][candidate] == 0) {
					return -1;
				}
			// row check if candidate knows anyone(row check)or anyone don't know
			// candidate(col
//        	check) then it is not the candidate
		}
		return candidate;

	}
//    Approach	Time Complexity	Space Complexity
//    Brute Force	O(n^2)	O(1)
//    Optimal	O(n)	O(1)

}
