package graph;
import java.util.*;
public class DFS_traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int adjMatrix[][] = { { 0, 1, 1, 0, 0 }, { 1, 0, 1, 1, 0 }, { 1, 1, 0, 0, 1 }, { 0, 1, 0, 0, 1 },
				{ 0, 0, 1, 1, 0 }, };
		DFS(adjMatrix);

	}

	public static void DFS(int adjMatrix[][]) {
		Stack<Integer>stk=new Stack<>();
		boolean[]visited=new boolean[adjMatrix.length];
		stk.push(0);
		while(!stk.isEmpty()) {
			int node=stk.pop();
			System.out.println(node);
			visited[node]=true;
			for(int i=0;i<adjMatrix.length;i++) {
				if(adjMatrix[node][i]==1) {
					if(visited[i]==false) {
						stk.push(i);
						visited[i]=true;
					}
				}
			}
		}

	}

}
