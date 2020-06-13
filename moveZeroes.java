package LeetCodePractice;

import java.util.Arrays;

public class moveZeroes {
    public static void moveZeroes(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
             nums[count++] = nums[i];
            }
        }   
        int diff = nums.length - count;
        while(diff != 0){
            nums[nums.length - diff] = 0;
            diff--;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 0, 1, 2, 3, 0};
		moveZeroes(arr);
		System.out.println(Arrays.toString(arr));

	}

}
