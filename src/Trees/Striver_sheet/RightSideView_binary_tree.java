package Trees.Striver_sheet;
import java.util.*;
public class RightSideView_binary_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	List<Integer>list=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
    	Queue<TreeNode> q=new LinkedList<>();
    	if(root==null) {
    		return list;//if tree is empty
    	}
    	q.add(root);
    	while(!q.isEmpty()) {
    		int size=q.size();// number of nodes in this level
    		for(int i=0;i<size;i++) {
    			TreeNode curr=q.remove();
    			if(i==size-1) {
    				list.add(curr.val);
    			}
    			// add left and right children if they exist
    			if(curr.left!=null) {
    				q.add(curr.left);
    			}
    			if(curr.right!=null) {
    				q.add(curr.right);
    			}
    		}
    		
    		
    	}
    	return list;
    	

    }
    
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

}
