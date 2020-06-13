package LeetCodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class allPossibleFBT {
	 public static List<TreeNode> allPossibleFBT(int N) {
		 List<TreeNode> tree = new ArrayList<TreeNode>();
		 //if it goes negative
	     if(N < 1) {
	    	 return tree;
	     }
	     //if there are even number of nodes
	     if(N % 2 == 0) {
	    	 return tree;
	     }
	     //if there is only 1 node
	     if(N == 1) {
	    	 tree.add(new TreeNode(0));
	    	 return tree;
	     }
	     //form the possible trees
	     //add i + 2 because full binary trees has atmost 2 children
	     for(int i = 1; i < N - 1; i += 2) {
	    	 List<TreeNode> left = allPossibleFBT(i);//1 3 5 going forward for left
	    	 List<TreeNode> right = allPossibleFBT(N - 1 - i);//5 3 1 doing same but from back for right
	    	 for(TreeNode l : left) {//need this to pick out each left treenode from the list
	    		 for(TreeNode r : right) {//need this to pick out each right treenode from the list
	    			 TreeNode root = new TreeNode(0);
	    			 root.left = l;
	    			 root.right = r;
	    			 tree.add(root);
	    		 }
		    	 
		     }
	     }
	     
	     
	     return tree;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<TreeNode> tree = allPossibleFBT(3);
		
		System.out.println(Arrays.asList(tree));

	}

}
