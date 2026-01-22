package leetcode041;

public class Solution {
	
	// Preallocated at fixed length, because project requirement
	// says storage is O(1)
	//
	private boolean[] present = new boolean[100002];
	
    public int firstMissingPositive(int[] nums) {

        for (int i=0; i<nums.length; i++) {
        		if (nums[i]>0 && nums[i] < present.length-1)
        			present[nums[i]] = true;
        }
        for (int i=1; i<present.length; i++)
        		if (!present[i])
        			return i;
        return -1;
    }
}
