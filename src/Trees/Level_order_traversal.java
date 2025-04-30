package Trees;
import java.util.*;
public class Level_order_traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        levelOrderTraversal2(root);
        levelOrderTraversal(root);

	}
	public static void levelOrderTraversal(TreeNode root) {
		System.out.println();
		Queue<TreeNode> queue=new LinkedList<>();
		queue.add(root);
		queue.add(null);//to identify the end of level as after root next level starts
		while(!queue.isEmpty()) {
			TreeNode temp=queue.poll();
			if(temp==null) {
				System.out.println();
				if(!queue.isEmpty()) {
					queue.add(null);//so that the one level exist betwween two null
					//to track the next level
				}
			}else {
				System.out.print(temp.val);
				if(temp.left!=null) {
					queue.add(temp.left);
				}
				if(temp.right!=null) {
					queue.add(temp.right);
				}
			}	
		}
	}
	//simplelogic
	public static void levelOrderTraversal2(TreeNode root) {
		if(root==null) {
			return;
		}
		Queue<TreeNode> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode temp=queue.poll();
			System.out.print(temp.val+" ");
			if(temp.left!=null) {
				queue.add(temp.left);
			}
			if(temp.right!=null) {
				queue.add(temp.right);
			}
			
		}
	}
	
	
	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int val){
			this.val=val;
		}
	}

}
