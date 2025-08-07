package Trees;
import Trees.isSameTree.TreeNode;
public class Max_depth_of_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int maxDepth(TreeNode root) {
	        if(root==null){
	            return 0;
	        }
	        int left=maxDepth(root.left);
	        int right=maxDepth(root.right);
	        return Math.max(left,right)+1;
	 }
}
