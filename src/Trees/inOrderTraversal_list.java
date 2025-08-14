package Trees;
import java.util.*;
import Trees.isSameTree.TreeNode;

public class inOrderTraversal_list {

    List<Integer>list =new ArrayList<>();;
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) {
        	return list;
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
        
    }
	
	public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        while(root!=null) {
        	inorderTraversal2(root.left);
        	list.add(root.val);
        	inorderTraversal2(root.right);
        }
        
        return list;
        
        
    }
	
	  public class TreeNode {
	      public int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }

}
