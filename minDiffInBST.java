		package LeetCodePractice;

import java.util.ArrayList;
import java.util.List;

public class minDiffInBST {
//	static List<Integer> list = new ArrayList<>();
//	public static int minDiffInBST(TreeNode root) {
//	    if(root == null) {
//	    	return 0;
//	    }
//	    int diff1 = root.val - minDiffInBST(root.left);
//	    int diff2 = root.val - minDiffInBST(root.right);
//	    if(diff1 <= diff2) {
//	    	return Math.abs(diff1);
//	    }
//	    else {
//	    	return Math.abs(diff2);
//	    }
		
		//not an optimal solution
//		inorder(root);
//		int min = Integer.MAX_VALUE;
//		for(int i = 1; i < list.size(); i++) {
//			min = Math.min(min, Math.abs(list.get(i) - list.get(i - 1)));
//		}
//		return min;
//	}
//	
//	private static void inorder(TreeNode root) {
//		// TODO Auto-generated method stub
//		if(root == null) {
//			return;
//		}
//		inorder(root.left);
//		list.add(root.val);
//		inorder(root.right);
//
//	}
		
		static int t = Integer.MAX_VALUE;
	    static int prev = Integer.MAX_VALUE;
	    
	    public static int minDiffInBST(TreeNode root) {
	    	if(root == null) {
	    		return 0;
	    	}
	    	minDiffInBST(root.left);
	    	if(prev != Integer.MAX_VALUE) {
	    		t = Math.min(t,Math.abs(root.val - prev));
	    	}
	    	prev = root.val;
	    	minDiffInBST(root.right);
	    	return t;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tree = new TreeNode(4);
		tree.left = new TreeNode(2); tree.right = new TreeNode(6);
		tree.left.left = new TreeNode(1); tree.left.right = new TreeNode(3);
		tree.right.left = new TreeNode(50);
		tree.left.left.left = new TreeNode(44);
		System.out.println(minDiffInBST(tree));

	}

}

