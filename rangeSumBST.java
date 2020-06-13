package LeetCodePractice;


public class rangeSumBST {
	public static int rangeSumBST(TreeNode root, int L, int R) {
		return rangeHelper(root, L, R);
	}

	private static int rangeHelper(TreeNode root, int L, int R) {
	// TODO Auto-generated method stub
	int res = 0;
	if(root == null) {
		return 0;
	}
	//value added in between the range
	if(root.val >= L && root.val <= R) {
		res += root.val;
	}
	//value != L
	if(root.val > L) {
		res += rangeHelper(root.left, L, R);
	}
	//value != R
	if(root.val < R) {
		res += rangeHelper(root.right, L, R);
	}
	
	return res;
    
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tree = new TreeNode(10);
		tree.left = new TreeNode(5); tree.right = new TreeNode(15);
		tree.left.left = new TreeNode(3); tree.left.right = new TreeNode(7);
		tree.right.left = new TreeNode(); tree.right.right = new TreeNode(18);
		System.out.println(rangeSumBST(tree, 7, 15));
	}

}
