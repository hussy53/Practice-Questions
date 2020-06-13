package LeetCodePractice;

import java.util.ArrayList;
import java.util.List;

public class practiceJava {
	
	 static int ans = 0;
	 public static int longestUnivaluePath(TreeNode root) { 
		 LUP(root);
		 return ans;
	 }
	 public static int LUP(TreeNode root) {
		 if(root == null) {
			 return 0;
		 }
		 int left = LUP(root.left);
		 int right = LUP(root.right);
		 int arrowLeft = 0; int arrowRight = 0;
		 if(root.left != null && root.left.val == root.val) {
			 arrowLeft += left + 1;
		 }
		 if(root.right != null && root.right.val == root.val) {
			 arrowRight += right + 1;
		 }
		 ans = Math.max(ans, arrowLeft + arrowRight);
		 return Math.max(arrowLeft, arrowRight);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(4); tree.right = new TreeNode(5);
		tree.left.left = new TreeNode(4); tree.left.right = new TreeNode(4);
		tree.right.left = new TreeNode(); tree.right.right = new TreeNode(5);
		System.out.println(longestUnivaluePath(tree));	}

}
