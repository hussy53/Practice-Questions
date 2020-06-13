package LeetCodePractice;

class TreeNode {
	      int val;
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

public class maxDepth {
	
public static int maxDepth(TreeNode root) {
	if(root == null) return 0;
	int left = maxDepth(root.left); //recursively calculate left subtree
	int right = maxDepth(root.right); //recursively calculate right subtree
	return Math.max(left, right) + 1; //take the max from the two and add one to it 
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tree = new TreeNode(5);
		tree.left = new TreeNode(3); tree.right = new TreeNode(6);
		tree.left.left = new TreeNode(10); tree.left.right = new TreeNode(13); tree.right.left = new TreeNode(20);
		int treeDepth = maxDepth(tree);
		System.out.println(treeDepth);
		
	}

}
