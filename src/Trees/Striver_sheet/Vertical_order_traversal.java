package Trees.Striver_sheet;

import java.util.*;

public class Vertical_order_traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> verticalTraversal(TreeNode root) {
		List<List<Integer>> list=new ArrayList<>();
		Queue<Triplet> q = new LinkedList<>();
		Map<Integer,List<int[]>> map=new TreeMap<>();//it stores hd,values
		if(root==null) {
			return list;
		}
		q.add(new Triplet(root,0,0));
		
		while(!q.isEmpty()) {
			Triplet current=q.poll();
			TreeNode node=current.node;
			int level=current.level;
			int hd=current.hd;
			
			if(!map.containsKey(hd)) {
				map.put(hd,new ArrayList<>());
			}
			map.get(hd).add(new int[] {level,node.val});
			
			if(node.left!=null) {
				q.add(new Triplet(node.left,hd-1,level+1));
			}
			if(node.right!=null) {
				q.add(new Triplet(node.right,hd+1,level+1));
			}
		}
		
		//sorting the map data with level or the nodes having same value as for hd it is already sorted
		for(List<int[]>value: map.values()) {
			value.sort((a,b)->{
				if(a[0]!=b[0]) {
					return a[0]-b[0]; //level wise
				}
				return a[1]-b[1];//node value wise
			});
			
			List<Integer>ans=new ArrayList<>();//as we have to take node value only
			for(int []arr :value) {
				ans.add(arr[1]);
				
			}
			list.add(ans);
		}
		return list;
	}

	static class Triplet {
		TreeNode node;
		int hd;
		int level;

		Triplet(TreeNode node, int hd,int level) {
			this.node = node;
			this.hd = hd;
			this.level=level;
		}
	}

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}

	}

}
