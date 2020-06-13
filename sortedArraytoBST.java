package LeetCodePractice;

import java.util.Arrays;

public class sortedArraytoBST {
	public static TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length == 0) {
			return null; //if the tree is empty
		}
		return constructBST(nums, 0, nums.length - 1);
    }
	
	public static TreeNode constructBST(int[] nums, int left, int right) {
		if(left > right) {
			return null; //if we have traversed all the elements
		}
		int mid = nums.length / 2;
		TreeNode root = new TreeNode(nums[mid]); //the root
		root.left = constructBST(nums, left, mid - 1); //since it's sorted we construct from the first
													   //element to mid - 1
		root.right = constructBST(nums, mid + 1, right); //do the same for the right half upto the end
		                                                 //of the array
		return root; //return the tree
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-10, -3, 0, 5, 9};
		sortedArrayToBST(arr);
		System.out.println(arr);
	}

}
