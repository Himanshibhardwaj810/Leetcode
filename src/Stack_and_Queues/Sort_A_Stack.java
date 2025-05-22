package Stack_and_Queues;
import java.util.*;
public class Sort_A_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//temp stack is taken to maintain the sorted order if element in tempstack peek
	//is greater then they are popped and push back to original 
	//temp val is used to hold the temporary value of pop elemnet of original
	
	public static void sortStack(Stack<Integer>original) {
		Stack<Integer>tempstack=new Stack<>();
		while(!original.isEmpty()) {
			int tempval=original.pop();
			//if the temp stack's peek value is greater than tempval of original
			//then pop the tempstack and push it back to original as smaller elements 
			//exist
			while(!tempstack.empty() && tempval<tempstack.peek()) {
				original.push(tempstack.pop());
			}
			tempstack.push(tempval);
		}
		//copying the value back to original
		while(!tempstack.isEmpty()) {
			original.push(tempstack.pop());
		}
	}
	
	//time complexity=o(n2)
	//space complexity=o(n)

}
