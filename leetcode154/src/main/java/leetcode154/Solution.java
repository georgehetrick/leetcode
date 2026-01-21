package leetcode154;

/**
 * How this could have been classified as a difficult problem, I don't know.
 */
public class Solution {
    public int findMin(int[] nums) {
    	for (int i=1; i<nums.length; i++) {
    		if (nums[i]<nums[i-1])
    			return nums[i];
    	}
        return nums[0];
    }

}
