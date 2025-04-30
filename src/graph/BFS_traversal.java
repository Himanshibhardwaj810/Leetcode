package graph;
import java.util.*;
public class BFS_traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int adjMatrix[][]= {
				{0,1,1,0,0},
				{1,0,1,1,0},
				{1,1,0,0,1},
				{0,1,0,0,1},
				{0,0,1,1,0},
		};
		BFS(adjMatrix);

	}
	
	public static void BFS(int adjMatrix[][]){
		Queue<Integer>queue=new LinkedList<>();
		boolean visited[]=new boolean[adjMatrix.length];//if using non-primitive Boolean then i haved to first initialize with false as it is by default i
		//it is null
	    queue.add(0);
		while(!queue.isEmpty()) {
			int node=queue.poll();
			System.out.println(node);
			visited[node]=true;
			for(int j=0;j<adjMatrix.length;j++) {
				if(adjMatrix[node][j]==1) {
					if(visited[j]==false) {
						queue.add(j);
						visited[j]=true;
					}
				}
			}
			
		}
		
		
	}
	
	

}
