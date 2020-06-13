package LeetCodePractice;

import java.util.Arrays;

public class singleNumber {
//	private static int singleNumHelper(int i, int[] nums) {
//		// TODO Auto-generated method stub
//		int j = 0;
//		int diffNum;
//		if(i == nums[j] && nums.length != 1) {
//			return singleNumHelper(nums[j++], Arrays.copyOfRange(nums, j, nums.length - 1));
//		}
//		else {
//			return singleNumHelper(nums[j], Arrays.copyOfRange(nums, j++, nums.length - 1)); 
//		}
//	}
	 public static int singleNumber(int[] nums) {
//		 Arrays.sort(nums);
////		 return singleNumHelper(nums[0], Arrays.copyOfRange(nums, 1, nums.length - 1));
//		 int i = 1;
//		 int temp = nums[0];
//		 while(i < nums.length) {
//			 if(nums[i] == nums[i - 1]) {
//				 i = i + 1;
//			 }
//			 else {
//				 temp = nums[i - 1];
//				 i = i + 1;
//			 }
//		 }
//		 return temp;
//		 }
//		 
		 Arrays.sort(nums);
		 int result = 0;
		 for(int i = 0; i < nums.length; i++) {
			 result = result ^ nums[i];
				 //return result;
		 }
		 return result;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 1, 2, 1, 1, 3, 3, 2, 1, 5, 1};
		int result = singleNumber(nums);
		System.out.println(result);

	}

}
