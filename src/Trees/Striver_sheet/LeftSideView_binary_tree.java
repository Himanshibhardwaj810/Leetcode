package Trees.Striver_sheet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Trees.Striver_sheet.RightSideView_binary_tree.TreeNode;

public class LeftSideView_binary_tree {

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
    			if(i==0) {
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

}
