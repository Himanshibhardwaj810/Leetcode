package Trees.Striver_sheet;

import java.util.*;

import Trees.Striver_sheet.Vertical_order_traversal.TreeNode;

public class Morris_Inorder_traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> inorderTraversal(TreeNode root) {
		 List<Integer> res=new ArrayList<>();
	        if(root==null) return res;
	        TreeNode curr=root;
	        while(curr!=null){
	            if(curr.left==null){//if left side gets null then print the value
	                res.add(curr.val);
	                curr=curr.right;//move to right as per inorder
	            }
	            else{
	                TreeNode leftChild=curr.left;
	                while (leftChild.right!=null){//go to the rightmost node of left child
	                    leftChild=leftChild.right;//till right is null
	                }
	                leftChild.right=curr;//connect the right node with curr node

	                //delete the link between curr and curr.left otherwise the loop continues
	                TreeNode temp=curr;
	                curr=curr.left;
	                temp.left=null;
	            }
	        }
	        return res;
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
