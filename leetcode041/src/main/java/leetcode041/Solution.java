package leetcode041;

public class Solution {

	/* this is garbage */
    public int firstMissingPositive(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<nums.length; i++)
	        	if (nums[i]>0 && nums[i]<smallest)
	        		smallest = nums[i];
        return smallest-1;
    }
}
