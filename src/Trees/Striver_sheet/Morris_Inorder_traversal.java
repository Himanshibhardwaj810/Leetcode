package Trees.Striver_sheet;

import java.util.*;

import Trees.Striver_sheet.Vertical_order_traversal.TreeNode;

public class Morris_Inorder_traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	time complexity o(n)
//	space complexity=o(1)

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
		TreeNode curr = root;
		while (curr != null) {
			if (curr.left == null) {//left node end ->visit root -> right
				res.add(curr.val);
				curr = curr.right;
			} else {
				TreeNode leftChild = curr.left;
				// IMPORTANT: Stop if we reach a thread back to curr
				while (leftChild.right != null && leftChild.right != curr) {
					leftChild = leftChild.right;
				}
				if (leftChild.right == null) {
					// First time visiting the left subtree making thread
					leftChild.right = curr;
					curr = curr.left;
				} else {
					// Second time → remove thread and visit
					leftChild.right = null;
					res.add(curr.val);
					curr = curr.right;
				}
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
