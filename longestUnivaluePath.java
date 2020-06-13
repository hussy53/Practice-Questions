package LeetCodePractice;

public class longestUnivaluePath {
		static int ans = 0;
	    public static int longestUnivaluePath(TreeNode root) { 
	        LUP(root);
	        return ans;
	    }
	    public static int LUP(TreeNode root) {
	        if (root == null) return 0;
	        int left = LUP(root.left);
	        int right = LUP(root.right);
	        int arrowLeft = 0, arrowRight = 0;
	        if (root.left != null && root.left.val == root.val) {
	            arrowLeft += left + 1;
	        }
	        if (root.right != null && root.right.val == root.val) {
	            arrowRight += right + 1;
	        }
	        ans = Math.max(ans, arrowLeft + arrowRight);
	        return Math.max(arrowLeft, arrowRight);
	    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tree = new TreeNode(5);
		tree.left = new TreeNode(4); tree.right = new TreeNode(5);
		tree.left.left = new TreeNode(1); tree.left.right = new TreeNode(1);
		tree.right.right = new TreeNode(5);
//		tree.left = new TreeNode(2);
		System.out.println(longestUnivaluePath(tree));

	}

}
