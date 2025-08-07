package Trees;

import Trees.isSameTree.TreeNode;

public class Balanced_binary_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//🔁 This is an optimization step:
		//Jab hume pata chal jaata hai ki left ya right subtree already unbalanced hai (i.e., -1 return kar diya),

		//To ab aage check karne ka koi fayda nahi, pura tree waise hi unbalanced ho chuka hai.

		//Isliye hum turant -1 return kar dete hain bina aage ki calculation ke.

	public boolean isBalanced(TreeNode root) {
        if(checkHeight(root)!=-1){
            return true;
        }
        return false;
        
    }

    	 public int checkHeight(TreeNode root) {
	        if(root==null){
	            return 0;
	        }
	        int leftHeight=checkHeight(root.left);
	        int rightHeight=checkHeight(root.right);

	        ////if the tree is unbalanced immediately return -1 
            if(leftHeight==-1 || rightHeight==-1 || Math.abs(leftHeight-rightHeight)>1 ){
                return -1;
            }
	        return Math.max(leftHeight,rightHeight)+1;
	 }

	public boolean isBalanced2(TreeNode root) {
		if (root == null) {
			return true;
		}
		int left = checkHeight2(root.left);
		int right = checkHeight2(root.right);

		return Math.abs(left - right) <= 1 && isBalanced2(root.left) && isBalanced2(root.right);

	}
//2nd approch
	public int checkHeight2(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = checkHeight2(root.left);
		int right = checkHeight2(root.right);
		return Math.max(left, right) + 1;
	}
	//🔁 This is an optimization step:
	//Jab hume pata chal jaata hai ki left ya right subtree already unbalanced hai (i.e., -1 return kar diya),

	//To ab aage check karne ka koi fayda nahi, pura tree waise hi unbalanced ho chuka hai.

	//Isliye hum turant -1 return kar dete hain bina aage ki calculation ke.

}
