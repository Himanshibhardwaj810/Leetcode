package Trees.Striver_sheet;

import java.util.*;
import Trees.Striver_sheet.Morris_Inorder_traversal.TreeNode;;

public class Morris_Preorder_traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//intuition  when we first traverdse left subtree we make thread and then the curr is root and remain same
	//so we add it in res and thwm nove to left
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
		TreeNode curr = root;
		while (curr != null) {
			if (curr.left == null) {
				res.add(curr.val);//this is left node ends->visit root->right
				curr = curr.right;
			} else {
				TreeNode leftChild = curr.left;
				// IMPORTANT: Stop if we reach a thread back to curr
				while (leftChild.right != null && leftChild.right != curr) {
					leftChild = leftChild.right;
				}
				if (leftChild.right == null) {
					// First time visiting the left subtree making thread and then 
					leftChild.right = curr;
					res.add(curr.val);//the curr is root print it
					curr = curr.left;
				} else {
					// Second time → remove thread and visit right node
					leftChild.right = null;
					curr = curr.right;
				}
			}

		}
		return res;
	}

}
