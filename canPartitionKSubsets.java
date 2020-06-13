package LeetCodePractice;

import java.util.stream.IntStream;

public class canPartitionKSubsets {
	public static boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = IntStream.of(nums).sum();//adds the sum of elements in the array nums
        //now check if sum is not divisible by k or empty
        if(k == 0 || sum % k != 0) {
        	return false;
        }
        return canPartition(0, nums, new boolean[nums.length], k, 0, sum / k);
	}

	private static boolean canPartition(int i, int[] nums, boolean[] used, int k, int inProgSum, int targetSum) {
		// TODO Auto-generated method stub
		//if we have only one bucket left, we are sure all buckets in this
		//array can be partitioned
		if(k == 1) {
			return true;
		}
		//check if each bucket is filled or not, then reduce the no. of buckets
		if(inProgSum == targetSum) {
			return canPartition(0, nums, used, k - 1, 0, targetSum);
		}
		//if an element is used, mark it so it won't be used next time
		for(int j = i; j < nums.length; j++) {
			//check with first element and see if it is true with the next element.
			//if not then it will recurse inside recursion and check the first 
			//element with the third element and so on. So it will be like
			//[4[3]] returns false. Then checks for[4[2]] return false....
			//until it reaches [4[1]] and returns true. And so these 2 elements
			//will be used and in the next iteration with 3 it will be ignored since 
			//it has been used.
			if(!used[j]) {
				used[j] = true;
					if(canPartition(j + 1, nums, used, k, inProgSum + nums[j], targetSum)) {
						return true;
					}
				used[j] = false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2, 2, 2, 2, 3, 4, 5};
		System.out.println(canPartitionKSubsets(nums, 4));

	}

}
