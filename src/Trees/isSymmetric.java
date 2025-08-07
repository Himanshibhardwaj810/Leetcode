package Trees;

import Trees.isSameTree.TreeNode;

public class isSymmetric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isSymmetric(TreeNode root) {
		return isMirror(root.left, root.right);
	}

	public boolean isMirror(TreeNode T1,TreeNode T2){
	        if(T1==null && T2==null){
	            return true;
	        }
	        if(T1==null || T2==null){
	            return false;
	        }

	        if(T1.val==T2.val){
	            return isMirror(T1.left,T2.right) && isMirror(T1.right,T2.left);
	        }
	        return false;
	     }

	public class TreeNode {
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
